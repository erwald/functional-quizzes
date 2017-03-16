(ns quiz-02-sum
  (:require [clojure.test :refer :all]))

;; This is the sum function that we would like you to implement using recursion.
;; It takes a list of integers and returns the sum of those integers.
;;
;; TIP: you might find the `first` and `rest` functions useful here.
(defn sum [x]
  0)

;; Example calls
(sum [0])
(sum [1 1])
(sum [-1 -1])
(sum [1 -1 -2 2])
(sum [1 2 3 5 7 11])
(sum [1 -2 3 -5 7 -11])

;; Tests
(deftest factorial-test
  (is (= 0 (sum [0])))
  (is (= 2 (sum [1 1])))
  (is (= -2 (sum [-1 -1])))
  (is (= 0 (sum [1 -1 -2 2])))
  (is (= 29 (sum [1 2 3 5 7 11])))
  (is (= -7 (sum [1 -2 3 -5 7 -11]))))
