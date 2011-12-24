(ns hellocompojure.core
  (:use [compojure.core :only (GET POST defroutes)]
        [compojure.route :only (not-found)]
        [compojure.handler :only (site)]
        [clojure.java.io :only (resource)]
        [stencil.core :only (render-file)]))

(defn render-root
  []
  (resource "root.html"))

(defn render-hello
  [name]
  (render-file "hello.html" {:name name}))

(defroutes main-routes
  (GET "/" [] (render-root))
  (POST "/hello" [name] (render-hello name))
  (not-found "Page not found"))

(def app
  (site main-routes))
