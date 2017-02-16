;; Here we define our namespace -- quiz-01-factorial -- and import the testing
;; library (which is among the core libraries).
(ns quiz-01-factorial
  (:require [clojure.test :refer :all]))

;; This is the factorial function. Right now, it doesn't work; it's up to you to
;; implement it in order to get the tests passing.
(defn factorial [x]
  x)

;; Here we are just calling our factorial function with different arguments. If
;; you're using Nightcode, you can open up the InstaREPL and see the return
;; values for each call on the left.
(factorial 0)
(factorial 1)
(factorial 5)

;; We can use the built-in testing library to write unit tests. In order to run
;; the tests, start the REPL, load this file and type:
;;
;;    (run-tests)
;;
;; The most important thing to see here is the "is" expression, which we can use
;; to make assertions (here testing that (factorial 0) returns 1 and that
;; (factorial 5) returns 120).
(deftest factorial-test
  (is (= 1 (factorial 0)))
  (is (= 120 (factorial 5))))
