;;; We'll start really slow, with a simple Fizz-Buzz function.

;; Here we define our namespace -- quiz-00-fizzbuzz -- and import the
;; clojure.test namespace into it (which is part of the standard
;; library).
(ns quiz-00-fizzbuzz
  (:require [clojure.test :refer :all])) 

;; This is the stub for the Fizz-Buzz function. Like about every Fizz-Buzz 
;; function in the world, this one is supposed to return "fizz" if n is
;; divisible by 3, "buzz" if it is divisible by 5, "fizzbuzz" if it can be
;; divided by _both_ 3 and 5, and n otherwise.
;;
;; Right now, the function always just returns the n passed to it, which
;; of course is not the correct solution. Your task, should you accept it,
;; is to make it work.
(defn fizz-buzz [n]
  n)

;; Here we are just calling our Fizz-Buzz function with different arguments. If
;; you're using Nightcode, you can open up the InstaREPL and see the return
;; values for each call on the left.
(fizz-buzz 4)
(fizz-buzz 9)
(fizz-buzz 10)
(fizz-buzz 45)

;; We can use the built-in clojure.test library to write unit tests. In order to 
;; run the tests, start the REPL ("Run with REPL" in Nightcode), load this file 
;; (Nightcode: "Reload File") and type:
;;
;;    (in-ns 'quiz-00-fizzbuzz) ; switch to namespace, required only once
;;    (run-tests)
;;
;; The most important thing to see here is the "is" expression, which we can use
;; to make assertions (in this case, testing that `(fizz-buzz 9)` returns "fizz",
;; for instance).
(deftest fizz-buzz-test
  (is (= 4 (fizz-buzz 4)))
  (is (= "fizz" (fizz-buzz 9)))
  (is (= "buzz" (fizz-buzz 10)))
  (is (= "fizzbuzz" (fizz-buzz 45))))

