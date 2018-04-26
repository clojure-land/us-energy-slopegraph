(ns us-energy-slopegraph.core
  (:require [cljsjs.d3]
            [clojure.string :as str]))

(enable-console-print!)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; data

(def data {})

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; helpers

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; draw functions

(defn data-join [parent tag class data]
  )

(defn draw-header [svg years]
  )

(defn draw-line [svg data-col-1 data-col-2]
  )

(defn draw-column [svg data-col index custom-attrs]
  )

(defn draw-slopegraph [svg data]
  )

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Lifecycle

(defn append-svg []
  )

(defn remove-svg []
  )

(defn ^:export main []
  )

(defn on-js-reload []
  (main))
