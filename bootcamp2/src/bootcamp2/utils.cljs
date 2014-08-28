(ns bootcamp2.utils)

(defn hello
  "This returns a string saying hello to person."
  [person feeling]
  ; (let [] ...)
  (let [greet (str "HI " person "!")
  	    question (str "Are you feeling " feeling "?")
  	    ]
  	(str greet " " question)))
