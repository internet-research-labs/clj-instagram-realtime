(ns instagram-realtime.middleware
  (:import  [java.net URL MalformedURLException])
  (:require [instagram-realtime.responses :as responses]
            [ring.util.request :refer [path-info body-string]]))

(defn- parse-path
  [url]
  (try (.getPath (URL. url))
       (catch MalformedURLException e nil)))

(defn wrap-handshake
  "Returns a function that handles the routing for instagram handshakes."
  [handler
   {client-id     :client-id
    client-secret :client-secret
    website-uri   :website-uri
    redirect-uri  :redirect-uri
    callback-url  :callback-url}]

  (let [callback-path (parse-path callback-url)]
    (fn [request]
      (if (= callback-path (path-info request))
        (responses/echo-hub-challenge request)
        (handler request)))))
