(defproject hara/example-deploy "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [hara/lib.aether "3.0.12"]]
  :profiles {:dev {:plugins [[cider/cider-nrepl "0.25.2"]]}}
  :repl-options {:init-ns example})
