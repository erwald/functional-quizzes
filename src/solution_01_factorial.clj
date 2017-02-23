(ns solution-01-factorial
  (:require [clojure.test :refer :all])) 

;; A naively recursive function. This works nicely for smaller
;; values of n, but blows up with a StackOverflowError if you
;; do `(factorial 1000N)`, for instance.
(defn factorial-1 [x]
  (if (= x 0)
    1
    (* x (factorial-1 (- x 1)))))


;; This version is optimized by using tail recursion with `recur`.
;; It uses the common functional idiom of defining a local function
;; which takes an accumulator as an additional argument.
(defn factorial-2 [x]
  (let [factorial-acc (fn [x acc]
                        (if (= x 0)
                          acc
                          (recur (- x 1) (* acc x))))]
    (factorial-acc x 1)))

;; We can, of course, simplify our factorial implementation dramatically
;; by using one of the built-in recursion functions - in this case,
;; §
(defn factorial-3 [x]
  (reduce * (range 1 (+ x 1))))

