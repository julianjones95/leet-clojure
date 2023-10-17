(ns two-sum.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  )

(defn twosum1
  [nums target]
  (let [indices (range (count nums))]
    (first (for [i indices
                 j indices
                 :when (and (not= i j)
                            (= target (+ (nth nums i)
                                         (nth nums j))))]
           [i j]))))

(defn twosum2
  [nums target]
  (let [diffs (map #(-> % (- target ) Math/abs)nums)]
    diffs))

(defn twosum [nums target]
  (loop [index-map {}
         nums nums
         idx 0]
    (if (empty? nums)
      nil
      (let [complement (- target (first nums))]
        (if (contains? index-map complement)
          [idx (index-map complement)]
          (do (recur (assoc index-map (first nums) idx) (rest nums) (inc idx))))))))

(twosum [2 7 11 15] 9)
