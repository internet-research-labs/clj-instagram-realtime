(defproject instagram-realtime "0.0.1-SNAPSHOT"
  :description "realtime instagram stuff"
  :url "http://irl.agency/"
  :license {:name "UNLICENSE" :url "http://unlicense.org/"}
  :dependencies [[javax.servlet/servlet-api "2.5"]
                 [org.clojure/clojure "1.6.0"]
                 [http-kit "2.1.16"]
                 [compojure "1.3.3"]
                 [clj-http "1.1.0"]
                 [ring/ring-mock "0.2.0"]
                 [ring/ring-codec "1.0.0"]])
