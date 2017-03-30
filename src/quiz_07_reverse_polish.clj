(ns quiz-07-reverse-polish
(:require [clojure.test :refer :all]))


(defn rpn [expression]
  "Calculates the RPN expression.
   An argument could be '(3 5 + 2 *)..."
  (parse-and-apply expression '()))

(defn parse-and-apply [expr stack]
  "Parses the elements of expr and puts them on the stack.
   If the element is an operator, it applies it to the stack."
  (cond
    (empty? expr) (first stack)
    :else (let [fst (first expr)]
            (if (contains? #{'+ '- '* '/} fst)
              (parse-and-apply
                (rest expr)
                (conj (drop 2 stack) (reduce (apply-op fst) (take 2 stack))))
              (parse-and-apply (rest expr) (conj stack fst))))))


(defn apply-op [op]
  "Returns a partial function for a quoted operator (like '+)."
  (cond
    (= op '+) (partial +)
    (= op '-) (partial -)
    (= op '*) (partial *)
    (= op '/) (partial /)))

;; some simple tests
(rpn '(1 1 +))
(rpn '(2 3 * 5 +))
(rpn '(2 3 5 * +))
