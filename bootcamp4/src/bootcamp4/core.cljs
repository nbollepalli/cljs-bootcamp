(ns bootcamp4.core
  (:require-macros [hiccups.core :refer [html defhtml]])
  (:require
    [quiescent]
    [sablono.core :as sablono :include-macros true]
    [hiccups.runtime]
    [weasel.repl :as repl]))

(repl/connect "ws://localhost:9001")

(enable-console-print!)

(defn by-id
  [id]
  (.getElementById js/document id))

(sablono/defhtml example-app [state]
  [:div "hi there!"])

(def page-state (atom {}))

(defn on-page-state-change [_ _ old-state new-state]
  (quiescent/render
    (example-app new-state)
    (by-id "appContainer"))
  )

(add-watch page-state :change on-page-state-change)


(defn init []
  (swap! page-state identity))

(aset js/window "onload" init)
