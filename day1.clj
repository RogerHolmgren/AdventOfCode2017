;; Get input from file to vector of ints
(def my-input (into [] (map #(Character/getNumericValue %) (str/trim-newline (slurp "day1input")))))

(defn parse [input sum]
  (cond
    (empty? (rest input)) (println sum) ;; If no more element return sum
    (= (first input) (second input)) (parse (rest input) (+ sum (first input))) ;; increase sum in recursive call
    :else (parse (rest input) sum))) ;; pass on sum in recursive call

(parse (conj my-input (first my-input)) 0 ) ;; input is with first element added to the end for circular stuff

