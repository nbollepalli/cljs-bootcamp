```
lein new mies bootcamp2
cd bootcamp2
lein cljsbuild auto
; open index.html in browser
```

We created a new file called utils.cljs:

```clj
; file at "src/bootcamp2/utils.cljs"
(ns bootcamp2.utils) ; notice the correlation between namespace and filename
```

Inside that file

```clj
(defn hello
  "This returns a string saying hello to person."
  [person]
  (str "Hi " person "!"))
```
