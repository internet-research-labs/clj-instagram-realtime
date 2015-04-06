(ns instagram-realtime.util-test
  (:require [clojure.test :refer :all]
            [instagram-realtime.util :refer [with-instagram *client-id*]]))


(deftest test-with-instagram
  (testing "with-instagram"
    (testing "should not blow up completely"
      (let [obj {:client-id "swag"}]
        (with-instagram obj
          (println "~~~" *client-id* "~~~")
          )))))

