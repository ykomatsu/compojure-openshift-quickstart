(ns hellocompojure.CoreServlet
  (:use [compojure.core :only (GET defroutes)]
        [compojure.route :only (not-found)]
        [compojure.handler :only (site)]
        [ring.util.servlet :only (defservice)])
  (:gen-class :extends javax.servlet.http.HttpServlet))

(defroutes main-routes
  (GET "/" [] "Hello, Compojure!")
  (not-found "Page not found"))

(def app
  (site main-routes))

(defservice app)
