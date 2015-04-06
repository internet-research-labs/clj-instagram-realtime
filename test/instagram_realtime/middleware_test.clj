(ns instagram-realtime.middleware-test
  (:require [clojure.test :refer :all]
            [org.httpkit.server :refer :all]
            [instagram-realtime.middleware :refer :all]
            [instagram-realtime.sample-requests :as samples]
            [compojure.core :refer :all]
            [compojure.route :as route]
            [compojure.handler :as handler]
            [compojure.response :as response]
            [ring.mock.request :as mock]))


(def ^:private client-info
  {:client-id      "597d57d253d446a89bda86c03b129326"
   :client-secret  "38a6ea19033641d987385bf8de52d16a"
   :website-url    "http://irl.dating/"
   :redirect-uri   "http://irl.dating/igredirect"
   :callback-url   "http://irl.dating/vv/e"})


(defroutes main-routes
  (GET "/" [] "whatevs")
  (route/resources "/")
  (route/not-found "Page not found"))


(def app
  (-> (handler/site main-routes)))


(deftest test-handshake-middleware
  (testing "handshake middleware"
    (testing "should fall-through for normal verifications"
      (let [wrapped-fn (wrap-handshake app client-info)]
        (is (= "whatevs" (:body (wrapped-fn samples/valid-request-1))))))
    (testing "should echo hub.challenge for callback-url"
      (let [wrapped-fn (wrap-handshake app client-info)]
        (is (=
             "15f7d1a91c1f40f8a748fd134752feb3"
             (->> samples/valid-request-2 (wrapped-fn) (:body))))))
    (testing "should respond with an echo")))
