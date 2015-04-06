(ns instagram-realtime.geo
  (:require [clj-http.client :as client]
            [instagram-realtime.constants :refer [API-URL]]))


(defn sync-subscribe
  "Sends an HTTP Request to Subscribe a Real-time Instagram Geo Stream.
  NOTE: This runs as a future."
  [& {:keys [lat lng radius]}]
  (client/post API-URL
               {:form-params {:client-id      "whatever"
                              :client-secret  "okay"
                              :object         "user"
                              :aspect         "media"
                              :verify-token   "myVerifyToken"
                              :callback-url   "sure"}}))


(defroutes yer-roues
  ;; ...
  nil)

(def 


(let [[app channel] (make-stream)


(def app
  (-> yer-routes
      (instagram-thing)))



(instagram-client-info
  {:client-id      "597d57d253d446a89bda86c03b129326"
   :client-secret  "38a6ea19033641d987385bf8de52d16a"
   :website-url    "http://irl.dating/"
   :redirect-uri   "http://irl.dating/igredirect"
   :callback-url   "http://irl.dating/vv/e"})

(with-instagram client-info
  (let [geo-channel (subscribe/geo :lng 10 :lat :20 :radius 100)
        tag-channel (subscribe/tag :tag "yolo")]
    ))


; (instagram-client-info
;   {:client-id      "597d57d253d446a89bda86c03b129326"
;    :client-secret  "38a6ea19033641d987385bf8de52d16a"
;    :website-url    "http://irl.dating/"
;    :redirect-uri   "http://irl.dating/igredirect"
;    :callback-url   "http://irl.dating/vv/e"}

;  (geo/subscribe :lng 0.0 :lat 0.0 :radius 100))

; curl -F 'client_id=CLIENT-ID' \
;      -F 'client_secret=CLIENT-SECRET' \
;      -F 'object=user' \
;      -F 'aspect=media' \
;      -F 'verify_token=myVerifyToken' \
;      -F 'callback_url=http://YOUR-CALLBACK/URL' \
;      https://api.instagram.com/v1/subscriptions/

; (geo/subscribe :lat 35.657872 :lng 139.70232 :radius 100)
