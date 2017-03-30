(ns quiz-06-reverse-polish
  (:require [clojure.test :refer :all]))

;; This function performs Reverse Polish notation calculations. It takes a list
;; of operands and operators in which every operator follows the operand (so the
;; revers from what you're used to seeing in Clojure), and calculates the result
;; of this (assuming all operators are binary operators).
;;
;; Taking an example from Wikipedia, the expression '5 + ((1 + 2) × 4) − 3' can
;; be expressed in the following way using Reverse Polish notation:
;;
;;    5 1 2 + 4 × + 3 −
;;
;; So the first three operands are pushed onto the stack, then 1 and 2 are
;; evaluated with the operator that follows them, then 4 is pushed onto the
;; stack, and then 4 and the result of (1 + 2) are evaluated with the operator
;; that follows (3 * 4) and so on, until the final result, 14, is attained and
;; returned. (There's a more detailed explanation on Wikipedia -- see below.)
;;
;; Reverse Polish notation can reduce memory usage in stack-based languages.
;; For more, see https://en.wikipedia.org/wiki/Reverse_Polish_notation
(defn reverse-polish [x]
  0)

;; Example calls
(reverse-polish '(1 1 +))
(reverse-polish '(1 2 3 + -))
(reverse-polish '(1 2 3 2 1 + / * -))
(reverse-polish '(5 1 2 + 4 * + 3 −))

;; Tests
(deftest sum-test
  (is (= 2 (reverse-polish '(1 1 +))))
  (is (= -4 (reverse-polish '(1 2 3 + -))))
  (is (= -1 (reverse-polish '(1 2 3 2 1 + / * -))))
  (is (= 14 (reverse-polish '(5 1 2 + 4 * + 3 −)))))

;; As usual, in order to run the tests, start the REPL, load this file and type:
;;
;;    (run-tests)
;;
