(ns quiz-06-group-by
  (:require [clojure.test :refer :all]))

;; This function splits a given list into groups for which the given function
;; returns true for the first element and each of the subsequent elements in it.
;; For instance, calling
;;
;;    [1 2 1 2]
;;
;; with the equals function (iow `(group-by-comparator = [1 2 1 2])`) would
;; return:
;;
;;    [[1 1] [2 2]]
(defn group-by-comparator [func list]
  list)

;; Example calls
(group-by-comparator = [])
(group-by-comparator = [1 2 1 2])
(group-by-comparator = [1 1 2 3 3]))

;; Tests
(deftest sum-test
  (is (= [[]] (group-by-comparator = [])))
  (is (= [[1 1] [2 2]] (group-by-comparator = [1 2 1 2])))
  (is (= [[1 1] [2] [3 3]] (group-by-comparator = [1 1 2 3 3]))))
