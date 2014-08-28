# ClojureScript Boot Camp at PROS

Now that we are using ClojureScript for three products at PROS, we are wanting
to introduce developers to the language through a series of 2-hour bootcamp
sessions.  (Initiated by Chris Oakman)

## Bootcamp 1

During this session, Chris introduced the language's features and benefits in a
high-level presentation.  We also covered its syntax.

- [Why ClojureScript? (slides)](http://oakmac.com/why-cljs)
- [Why ClojureScript? (video of March 2014 presentation)](https://www.youtube.com/watch?v=vyCMo0sMO5I)
- [ClojureScript Syntax](https://github.com/shaunlebron/ClojureScript-Syntax-in-15-minutes)

## Bootcamp 2

During this session, we walked through creating a simple project.  We learned about:

- Creating a base minimal project with `lein new mies bootcamp2`
- Creating files and namespaces
- Requiring namespaces and referencing their symbols
- Creating a function
- String concatentation
- Creating local "bindings" with the `let`-block (immutable values)
- Creating global "bindings" with `def` (immutable values)
- Creating an `atom` when we want mutation.
- Watching all transactions on an atom with `add-watch`
- Using `lein repl` in order to experiment with the language
- Quick intro to functional patterns with `map` `filter` and `reduce`
- Mathematical functions like `(+ 1 2 3)` and `(> 4 5 6)`
- The threading macros `->` and `->>` for making nested expressions read more naturally.

## Bootcamp 3

During this session, we walked through creating a new project.  We learned about:

- Creating a base project with a browser REPL `lein new mies-brepl bootcamp3`
- Starting the bREPL with `lein repl` and then `(brepl)`.
- JS Interop with `(.foo bar)` `(.-foo bar)` and `(foo.)`.
- How to include new library dependencies
- The case for using hiccups for HTML templating.
- How to build markup strings with data structures.
- How to use functions to dynamically generate markup strings.
- Generating an unordered list of items.
- Maintaining state of highlighted item in an atom.  (keeping state in your atom, not the DOM)


