(ns bootcamp3.core
  (:require-macros [hiccups.core :refer [html defhtml]])
  (:require
    [hiccups.runtime]
    [weasel.repl :as repl]))

(repl/connect "ws://localhost:9001")

(enable-console-print!)

(def active-tab (atom "tab4"))

(defn on-change-tab [_keyword _atom old-value new-value]
  (js/console.log "The tab changed!")
  (js/console.log (str "The old value was: " old-value))
  (js/console.log (str "The new value is: " new-value))
  (.removeClass (js/jQuery ".tab") "active")
  (.addClass (js/jQuery (str "#" new-value)) "active")
  )

(add-watch active-tab :change on-change-tab)

(defn by-id
  [id]
  (.getElementById js/document id))

(defn set-html!
  [id content]
  (set! (.-innerHTML (by-id id)) content))

(defhtml item
  [idx]
  [:li.tab {:id (str "tab" idx)} "Item " idx])

(set-html! "container"
           (html [:ul (map item (range 10))]))

(defn on-click-tab [js-event]
  (let [tab-id (aget js-event "currentTarget" "id")]
    (reset! active-tab tab-id)))  

(defn init []
  ;; $("#container").on("click", ".tab", clickTab);
  (.on (js/jQuery "#container") "click" ".tab" on-click-tab)
  (swap! active-tab identity)
  )

(js/jQuery init)