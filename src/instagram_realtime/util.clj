(ns instagram-realtime.util)


(declare ^:dynamic *client-id*)
(declare ^:dynamic *client-secret*)
(declare ^:dynamic *callback-url*)
(declare ^:dynamic *redirect-uri*)


(defmacro with-instagram
  "Dynamically binds to certain variables."
  [client-info & body]
  `(binding [*client-id*     (:client-id     ~client-info)
             *client-secret* (:client-secret ~client-info)
             *callback-url*  (:callback-url  ~client-info)
             *redirect-uri*  (:redirect-uri  ~client-info)]
     (println "sure" *client-id*)
     (println "sure" *client-secret*)
     (println "sure" *callback-url*)
     (println "sure" *redirect-uri*)
     ~@body))
