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

(defn click-the-button []
  (swap! page-state assoc :msg
         "you clicked the button!"))

(sablono/defhtml example-app [state]
  [:div
   [:button {:on-click click-the-button} "Click Me"]
   [:div (:msg state)]])

(def page-state
  (atom {:msg "This is a message!"
         }))

(defn on-page-state-change [_ _ old-state new-state]
  (quiescent/render
    (example-app new-state)
    (by-id "appContainer"))
  )

(add-watch page-state :change on-page-state-change)


(defn init []
  (swap! page-state identity))

(aset js/window "onload" init)
