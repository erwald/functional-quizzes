(ns quiz-08-fibonacci
  (:require [clojure.test :refer :all]))

;; In this excercise, we ask you to write a function that calculates fibonacci
;; numbers - ALL OF THEM. That is, make your function return a lazy infinite
;; sequence of all fibonnaci number. To quickly recap:
;;
;; - The first fibonacci number is 0
;; - The second fibonacci number is 1
;; - Every other fibonacci number is the sum of the previous two fibonacci
;;   numbers
;;
;; To make the problem a bit easier, you can start by first writing a recursive
;; `first-10-fibs` function that only returns the first 10 fibonacci numbers,
;; and then afterwards think about how to turn this into a lazy infinite
;; version using `lazy-seq` or `iterate`.
;;
;; When debugging, make sure that that you always evaluate something like
;; `(take 3 (fibs))` instead of `(fibs)` directly, otherwise you'll have
;; to wait inifinitely long for the answer!

(defn fibs []
  '())

;; Example calls
(first (fibs))
(take 10 (fibs))
(take-while #(< % 100) (fibs))

;; Tests
(deftest fibs-test
  (is (= 0 (first (fibs))))
  (is (= 1 (second (fibs))))
  (is (= '(0 1 1 2 3 5 8 13 21 34) (take 10 (fibs))))
  (is (= 6765 (nth (fibs) 20))))
