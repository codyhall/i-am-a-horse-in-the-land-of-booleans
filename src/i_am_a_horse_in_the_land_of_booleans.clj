(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]  (if  (or (= x false) (= x nil)) false true))


(defn abs [x]
  (if (neg? x) (- x) (+ x)))


(defn divides? [divisor n] (if (= (mod n divisor) 0) true false))

(defn fizzbuzz [n]
    (cond
     (= 0 (mod n 15)) "gotcha!"
     (= 0 (mod n 3)) "fizz"
     (= 0 (mod n 5)) "buzz"
     :else ""))

(defn teen? [age] (>= 19 (int age) 13))

(defn not-teen? [age]
(not (teen? age)))

(defn generic-doublificate [x]
  (cond
   (number? x) (* x 2)
   (= (count x) 0) nil
   (or (list? x) (vector? x) ) (* 2 (count x))
   :else true))

(defn leap-year? [year]
  (cond
    (= 0 (mod year 400)) true
    (= 0 (mod year 100)) false
    (= 0 (mod year 4)) true
    :else false))

; '_______'
