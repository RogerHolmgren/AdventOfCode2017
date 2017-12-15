(use '[clojure.string :only (split)])

(def my-input (map #(split % #" ") (split (slurp "day4input") #"\n")))

(reduce + (map #(if (apply distinct? %) 1 0) my-input))
