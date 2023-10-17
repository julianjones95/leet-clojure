(ns two-sum.core-test
  (:require [clojure.test :refer :all]
            [two-sum.core :refer :all]))

(deftest test-twosum1
  (testing "Testing twosum`
           function"
    (is (= (twosum1 [2 7 11 15] 9)    [0 1]))
    (is (= (twosum1 [3 2 4] 6)        [1 2]))
    (is (= (twosum1 [1 2 3 4 5 6] 10) [3 5]))
    (is (= (twosum1 [1 2 3 5] 7)      [1 3]))
    (is (= (twosum1 [1 2] 3)          [0 1]))))
