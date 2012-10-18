(ns louis-clj.test.core
  (:use [louis-clj.core])
  (:use [clojure.test]))

(deftest test-translations
  (are [in expected] (= (:out (translate ["en-us-g2.ctb"] in)) expected)  
       "Foo" ",foo"
       "Bar" ",b>"
       ))
