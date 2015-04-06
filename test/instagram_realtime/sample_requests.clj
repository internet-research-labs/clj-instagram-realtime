(ns instagram-realtime.sample-requests
  (:require [ring.mock.request :as mock]))

(def ring-request-1
  {:okay 1})

(def invalid-request-1
  1)

(def invalid-request-2
  [])

(def invalid-request-3
  {})

(def invalid-request-4
  {})

(def valid-request-1
  {:ssl-client-cert nil :cookies {} :remote-addr "0:0:0:0:0:0:0:1" :params {} :flash nil :route-params {}
   :headers {"host" "localhost:3000" "accept-language" "en-USen;q=0.8" "user-agent" "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_3) AppleWebKit/537.36 (KHTML like Gecko) Chrome/41.0.2272.118 Safari/537.36" "accept-encoding" "gzip deflate sdch" "connection" "keep-alive" "accept" "text/htmlapplication/xhtml+xmlapplication/xml;q=0.9image/webp*/*;q=0.8"}
   :server-port 3000 :content-length nil :form-params {} :session/key nil
   :query-params {} :content-type nil :character-encoding nil :uri "/" :server-name "localhost" :query-string nil
   :body "" :multipart-params {} :scheme :http :request-method :get :session {}})

(def valid-request-2
  (mock/request :get "/vv/e" {:hub.mode          "subscribe"
                         :hub.challenge     "15f7d1a91c1f40f8a748fd134752feb3"
                         :hub.verify_token  ""}))
