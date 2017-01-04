(defproject dsp-ring "0.1.0-SNAPSHOT"
  :description "A DSP simulator for testing."
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-ring "0.9.7"]]
  :ring {:handler dsp-ring.core/handler}
  :dependencies [[org.clojure/clojure "1.9.0-alpha14"]
                 [ring/ring-core "1.5.0"]
                 [ring/ring-jetty-adapter "1.5.0"]
                 [org.clojure/data.json "0.2.6"]]
  :main dsp-ring.core)
