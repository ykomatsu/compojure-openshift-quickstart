(ns hellocompojure.core
  (:use [compojure.core :only (GET defroutes)]
        [compojure.route :only (not-found)]
        [compojure.handler :only (site)]
        [stencil.core :only (render-file)]))

(defroutes main-routes
  (GET "/" [] "Hello, Compojure!")
  (not-found "Page not found"))

(def app
  (site main-routes))
