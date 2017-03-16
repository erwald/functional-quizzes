(ns quiz-04-making-change
  (:require [clojure.test :refer :all]))

(def euro-coins
  "The cent coins used in the Euro currency."
  [50 20 10 5 2 1])

(def imaginary-coins
  "The coins used in the some strange, imaginary currency."
  [10 7 1])

;; Here we want you to dress up in a cashier's uniform and start calculating
;; change (not following the example of the hot dog vendor who, when a Buddhist
;; monk had bought a hot dog, paying for it with a tenner and then asking for
;; the money he was owed, told the monk: "Change comes only from within!")
;;
;; This function, which you need to implement, takes an amount and a list of
;; coins, and returns the optimal change for the given amount (in other words,
;; the smallest amount of coins that, summed up, equal the given amount).
;;
;; As a first step, you can create a greedy algorithm that always picks the
;; largest coin until the sum exceeds the amount. Then you can think about also
;; making the algorithm work for the imaginary currency.
(defn make-change [amount coins]
  [])

;; Example calls
(make-change 50 euro-coins)
(make-change 88 euro-coins)
(make-change 73 euro-coins)
(make-change 20 imaginary-coins)
(make-change 14 imaginary-coins)

;; Tests
(deftest making-change-test
  (is (= [[50]] (make-change 50 euro-coins)))
  (is (= [euro-coins] (make-change 88 euro-coins)))
  (is (= [[50 20 2 1]] (make-change 73 euro-coins)))
  (is (= [[10 10]] (make-change 20 imaginary-coins)))
  (is (= [[7 7]] (make-change 14 imaginary-coins))))

;; Based on http://rubyquiz.com/quiz154.html
