# Compojure Quickstart for OpenShift Express

This is a simple quickstart for [Compojure][1].
Compojure is web framework for [Clojure][2].

  [1]: https://github.com/weavejester/compojure
  [2]: http://clojure.org/

## Running on OpenShift Express

    rhc-create-app -a hellocompojure -t jbossas-7.0

    cd hellocompojure
    git remote add upstream -m master git://github.com/ykomatsu/compojure-openshift-quickstart.git
    git pull -s recursive -X theirs upstream master

    git push

The quickstart code is licensed under the Apache License, Version 2.0: [http://www.apache.org/licenses/LICENSE-2.0.html][3]

  [3]: http://www.apache.org/licenses/LICENSE-2.0.html
