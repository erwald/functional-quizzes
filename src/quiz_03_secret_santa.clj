(ns quiz-03-secret-santa
  (:require [clojure.test :refer :all]))

;; Here are a bunch of people who wish to (or have at any rate been made to) give
;; anonymous gifts to one another.
(def people
  "A vector of people who are to give and recieve gifts."
  [["Homer" "Simpson"]
   ["Pindar" "Simpson"]
   ["Minnie" "Mouse"]
   ["Danger" "Mouse"]])

;; This is the Secret Santa function. It doesn't work; you need to implement it.
;; There are some restrictions, however:
;;
;; * Each person should be assigned a unique santa.
;; * No person should be assinged a santa from their own family (i.e. with their own
;;   surname).
;; * The result should be non-deterministic.
;;
;; Useful information here includes ...
(defn pick-secret-santa
  "Returns a vector of vector-pairs of people. The first person in each pair is the
  giver and the second person in each pair the receiver of a gift."
  [people]
  (map (fn [x] [x x]) people))

;; Here we're calling the pick-secret-santa function in order to see what it returns
;; in Nightcode's InstaREPL. The result we expect may look something like the
;; following:
;;
;; [[["Homer" "Simpson"] ["Minnie" "Mouse"]]
;;  [["Minnie" "Mouse"] ["Pindar" "Simpson"]]
;;  [["Pindar" "Simpson"] ["Danger" "Mouse"]]
;;  [["Danger" "Mouse"] ["Homer" "Simpson"]]]
(pick-secret-santa people)

;; In order to run the tests, start the REPL, load this file and type:
;;
;;    (run-tests)
;;
(deftest secret-santa-test
  (is (= (count people)
         (count (pick-secret-santa people))))
  (doseq [[[_ surname1] [_ surname2]] (pick-secret-santa people)]
    (is (not= surname1 surname2))))

;; In order to run the project in the REPL from the command line, do:
;;
;;    lein repl
;;
;; and then, in the REPL, load the file and run the tests like so:
;;
;;    (require 'quiz-03-secret-santa)
;;    ???
