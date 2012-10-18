(ns louis-clj.core)
(import 'org.liblouis.Translator)

(defn translate [tables in & {:keys [typeform spacing mode]}]
  {:out (.getBraille (.translate (Translator. (apply str (interpose \, tables))) in))})


