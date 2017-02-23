(ns quiz-01-factorial
  (:require [clojure.test :refer :all]))

;; This is the factorial function we would like you to implement. As a quick 
;; reminder, the factorial of n is n * (n - 1) * ... * 2 * 1. Try to implement
;; it with naive recursion first, without thinking about tail call optimization.
(defn factorial [x]
  x)

;; Example calls
(factorial 0)
(factorial 1)
(factorial 5)

;; Tests
(deftest factorial-test
  (is (= 1 (factorial 0)))
  (is (= 120 (factorial 5))))

