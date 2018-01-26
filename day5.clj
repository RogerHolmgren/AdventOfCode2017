(use '[clojure.string :only (split)])

(def my-input (into [] (map #(Integer/parseInt %) (split (slurp "day5input") #"\n"))))

(defn nextPointer [input p]
  (if (> (count input) (+ p (nth input p)))
    (+ p (nth input p))
    -1))

(defn parse 
  [input pointer my-count]
  (if (= pointer -1)
    (println my-count)
   ;; (println (take 10 input) " | pos: " pointer " is increased to " (+ pointer (nth input pointer)) )
    (recur (assoc input pointer (inc (nth input pointer))) (nextPointer input pointer) (inc my-count))))

(defn parse2
  [input pointer my-count]
  (if (= pointer -1)
    (println my-count)
    (recur (assoc input pointer (inc (nth input pointer))) (nextPointer input pointer) (inc my-count))))


(parse my-input2 0 0)
