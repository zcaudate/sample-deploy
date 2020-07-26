# deploy.example

Test case for clojars deployment

## Usage

```bash
$ lein repl
```

```clojure
> (use 'example)

> (sample-deploy)

;; -------------------
;; DEPLOYING ARTIFACTS
;; -------------------
;;   deploying     hara/base:jar                                     3.0.13                         
;;   deployed      hara/base:jar                                     3.0.13    [clojars]  (5.86s, 95180 bytes)
;;   deploying     hara/base:pom                                     3.0.13                         
;;   deployed      hara/base:pom                                     3.0.13    [clojars]  (4.69s, 0 bytes)
;;   deploying     hara/base:pom.asc                                 3.0.13                         
;;   deployed      hara/base:pom.asc                                 3.0.13    [clojars]  (6.25s, 0 bytes)
;;   deploying     hara/base:jar.asc                                 3.0.13                         
;;   deployed      hara/base:jar.asc                                 3.0.13    [clojars]  (2.76s, 454 bytes)

```


