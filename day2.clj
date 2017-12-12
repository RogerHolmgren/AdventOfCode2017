(use '[clojure.string :only (split)])

(def my-input (map #(split % #"\t") (split (slurp "day2input") #"\n")))

(defn rowSum [row]
  (- (apply max (map #(Integer/parseInt %) row)) (apply min (map #(Integer/parseInt %) row))))

(reduce + (map rowSum my-input))

