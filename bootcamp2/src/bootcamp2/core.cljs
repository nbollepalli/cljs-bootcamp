(ns bootcamp2.core
	(:require
		[bootcamp2.utils :refer [hello]]))

(enable-console-print!)

(def page-name (atom ""))

(reset! page-name "home")

(println @page-name)

(reset! page-name "another page")

(println @page-name)

(defn on-page-change
  [_ _ old-val new-val]
  (println "old:" old-val)
  (println "new:" new-val)
  )

(add-watch page-name :watcher on-page-change)

(reset! page-name "FAQ")
(reset! page-name "ABOUT")

