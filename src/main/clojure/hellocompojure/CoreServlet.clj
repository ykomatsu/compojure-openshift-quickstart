(ns hellocompojure.CoreServlet
  (:use [ring.util.servlet :only (defservice)]
        [hellocompojure.core :only (app)])
  (:gen-class :extends javax.servlet.http.HttpServlet))

(defservice app)
