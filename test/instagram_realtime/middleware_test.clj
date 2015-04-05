(ns instagram-realtime.middleware
  (:require [clojure.test :refer :all]
            [instagram-realtime.middleware :refer :all]))

(deftest test-handshake-middleware
  (testing "handshake middleware"
    (testing "should identify a verification")
    (testing "should identify an update")
    (testing "should respond with an echo")))
