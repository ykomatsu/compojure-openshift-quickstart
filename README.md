# Compojure Quickstart for OpenShift Express

This is a simple quickstart for [Compojure][1].
Compojure is a web framework for [Clojure][2].

  [1]: https://github.com/weavejester/compojure
  [2]: http://clojure.org/

## Deprecated

This project is no longer under active development.
If you would like to use Clojure on OpenShift, please use
[Immutant on OpenShift][3].

  [3]: https://github.com/immutant/openshift-quickstart

## Running on OpenShift Express

    rhc app create -a hellocompojure -t jbossas-7

    cd hellocompojure
    git remote add upstream -m master git://github.com/ykomatsu/compojure-openshift-quickstart.git
    git pull -s recursive -X theirs upstream master

    git push

## Running on the local computer

    mvn jetty:run

## License

The quickstart code is licensed under the Apache License, Version 2.0: [http://www.apache.org/licenses/LICENSE-2.0.html][4]

  [4]: http://www.apache.org/licenses/LICENSE-2.0.html
