(def target 23)

(defn parse [input circle distance]
  (map #(println %) (remove even? input))

  )

(parse (range 2 (+ target 1)) 0 0)
