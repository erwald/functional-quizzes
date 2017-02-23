(ns solution-00-fizzbuzz
  (:require [clojure.test :refer :all])) 

;; This is the most straight-forward, but most verbose solution,
;; using only nested `if` expressions, `mod`, `and` and `=`.
(defn fizz-buzz-1 [n]
  (if (and (= (mod n 3) 0) (= (mod n 5) 0))
    "fizzbuzz"
    (if (= (mod n 3) 0)
      "fizz"
      (if (= 0 (mod n 5))
        "buzz"
        n))))

;; In this second version, we remove some duplication by using
;; a `let` expression. Note the "?" at the end of our variable
;; names, which is a common idiom for boolean variables in
;; Clojure.
(defn fizz-buzz-2 [n]
  (let [divisible-by-3? (= (mod n 3) 0)
        divisible-by-5? (= (mod n 5) 0)]
    (if (and divisible-by-3? divisible-by-5?)
         "fizzbuzz"
         (if divisible-by-3?
           "fizz"
           (if divisible-by-5?
             "buzz"
             n)))))

;; In this last variant, we reduce clutter even further by using
;; `cond`. This lets us write code that is more similar to the
;; if-else cascades you probably know from other languages.
(defn fizz-buzz-3 [n]
  (let [divisible-by-3? (= (mod n 3) 0)
        divisible-by-5? (= (mod n 5) 0)]
    (cond
      (and divisible-by-3? divisible-by-5?) "fizzbuzz"
      divisible-by-3? "fizz"
      divisible-by-5? "buzz"
      :else n)))

(fizz-buzz-1 15)
(fizz-buzz-2 15)
(fizz-buzz-3 15)

