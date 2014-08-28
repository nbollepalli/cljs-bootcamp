(defproject bootcamp3 "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2311"]
                 [com.cemerick/piggieback "0.1.3"]
                 [weasel "0.4.0-SNAPSHOT"]
                 [hiccups "0.3.0"]]

  :plugins [[lein-cljsbuild "1.0.4-SNAPSHOT"]]

  :source-paths ["src"]

  :cljsbuild {
    :builds [{:id "bootcamp3"
              :source-paths ["src"]
              :compiler {
                :output-to "bootcamp3.js"
                :output-dir "out"
                :optimizations :none
                :source-map true}}]}

  :repl-options {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}
  :injections [(require 'weasel.repl.websocket)
               (def brepl #(cemerick.piggieback/cljs-repl :repl-env (weasel.repl.websocket/repl-env :port 9001)))])
