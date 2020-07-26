(ns example
  (:require [hara.lib.aether :as aether]))

(defn sample-deploy []
  (aether/deploy-artifact
   '[hara/base "3.0.13"]
   {:artifacts [{:file "files/hara-base-3.0.13.jar"
                 :extension "jar"}
                {:file "files/hara-base-3.0.13.pom"
                 :extension "pom"}
                {:file "files/hara-base-3.0.13.pom.asc"
                 :extension "pom.asc"}
                {:file "files/hara-base-3.0.13.jar.asc"
                 :extension "jar.asc"}]
    :repository {:id "clojars"
                 :url "https://clojars.org/repo/"
                 :authentication {:username "<USERNAME>"
                                  :password "<PASSWORD>"}}}))

(comment
  (sample-deploy))
