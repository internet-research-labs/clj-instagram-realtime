(ns instagram-realtime.middleware)

(defn wrap-handshake
  "Returns a function that handles the routing for instagram handshakes."
  [handler]
  (fn [request]
    (let [path (path-info request)]
      (if 
      ;; Continue down the chain
      (handler request))))
