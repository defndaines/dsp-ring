(ns dsp-ring.core
  (:require [ring.adapter.jetty :as jetty]
            [clojure.data.json :as json]))

(defn valid-bid []
  {:id (str (java.util.UUID/randomUUID))
   :seatbid
   [{:bid
     [{:adm "<img src=\"http://www.rubiconproject.com/wp-content/themes/rubicon_dark/images/ftr_icon.png?auction=${AUCTION_ID}&price=${AUCTION_PRICE:BF}\">"
       :adomain ["daines"]
       :crid "6655321"
       :id "required id per 4.3.3"
       :impid "impid per 4.3.3"
       :price (* 5 (rand))}]
     :seat "daines-seat"}]})

(defn no-bid []
  {:id (str (java.util.UUID/randomUUID))
   :seatbid []
   :nbr (rand-int 9)})

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "application/json"
             "X-nToggle-Response" "422"}
   :body (json/write-str (no-bid))})
