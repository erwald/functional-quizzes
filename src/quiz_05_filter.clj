(ns quiz-05-filter
  (:require [clojure.test :refer :all]))

;; This is the filter function. Reimplement it without using the core `filter`
;; function, but, for instance, using recursion.
;;
;; It takes a list and a function, applies the function to each element of the
;; list and returns a new list of those elements for which the given function
;; returned true.
(defn futu-filter [func x]
  x)

;; Example calls
(futu-filter odd? [])
(futu-filter even? [1])
(futu-filter odd? [-1 -2 -3 -4 -5])
(futu-filter even? (range 10))

;; Tests
(deftest sum-test
  (is (= [] (futu-filter odd? [])))
  (is (= [] (futu-filter even? [1])))
  (is (= [-1 -3 -5] (futu-filter odd? [-1 -2 -3 -4 -5])))
  (is (= [0 2 4 6 8] (futu-filter even? (range 10)))))
