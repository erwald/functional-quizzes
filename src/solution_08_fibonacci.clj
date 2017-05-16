(ns solution-08-fibonacci
  (:require [clojure.test :refer :all]))

;; Let's start with the simplified version, `first-10-fibs`. We use
;; `loop` here so that we can express the recursive algorithm more
;; easily. Each recursion step simply calculates the next fibonacci
;; number `c` from the previous two numbers `a` and `b` and adds
;; it to the accumulator vector with `conj`. It then recurs so
;; that `c` becomes the last previous number (`b`) in the next step.
;; When our iteration count `n` has passed 10, we return.
;;
;; Because the first two fibonacci numbers are special (in that they
;; are fixed instead of calculated from their predecessors), we start
;; by generating the fibonacci sequence from the third number onwards
;; and just prepend the first and second one at the end. With this
;; little trick, we don't need any special-case code path for the
;; initial fibonacci numbers, which simplifies our implementation.

(defn first-10-fibs []
  (loop [acc [], a 0, b 1, n 3]
    (if (> n 10)
      (cons 0 (cons 1 acc))
      (let [c (+ a b)]
        (recur (conj acc c)
               b c
               (inc n))))))

(first-10-fibs)

;; Now to our lazy infinite version. We use the same approach as
;; above: solve the problem of calculating all of the fibonacci
;; numbers after the first two, then prepend 0 and 1 to get the
;; full fibonacci sequence.
;;
;; First, the helper function `fibs-rest`. This is where the lazy
;; magic happens: by wrapping a `cons` with a recursive call
;; into `lazy-seq`, we generate a lazy sequence which calculates
;; fibonacci numbers as needed, using the same recursion step
;; as `first-10-fibs`. (We don't have the base case, though,
;; because our sequence is infinite after all!)

(defn fibs-rest [a b]
  (lazy-seq (let [c (+ a b)]
              (cons c (fibs-rest b c)))))

;; `fibs` now simply calls `fibs-rest` with the right initial
;; arguments and prepends the first two fibonacci numbers to
;; the result. Done!

(defn fibs []
  (cons 0 (cons 1 (fibs-rest 0 1))))

(take 10 (fibs))
