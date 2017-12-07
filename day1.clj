(require '[clojure.string :as str])

(def my-input (into [] (map #(Character/getNumericValue %) (str/trim-newline (slurp "day1input")))))

(defn parse [input sum]
  (cond
    (empty? (rest input)) (println sum)
    (= (first input) (second input)) (parse (rest input) (+ sum (first input)))
    :else (parse (rest input) sum)))

(parse (conj my-input (first my-input)) 0 )

