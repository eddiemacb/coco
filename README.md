# COCO-API

The back-end for product-compare-angular.


### Prerequisites

* Java 8
* maven

Install Java 8 and maven using [brew](https://brew.sh/) (on mac)
```sh
$ brew install java8
$ brew install maven
```
### Steps to build
```
$ mvn clean install
```

### Steps to run (choose 1 or 2)
1. For running in terminal:
    ```
    $ mvn spring-boot:run
    ```
2. For running dockerized cocoAPI:
    ```
    $ docker build -t cocoAPI .
    $ docker run -p 8080:8080 --name cocoAPI cocoAPI
    
    ```

### Successful Run
Browse to localhost:8080/products and should get a list of products for the product-compare-angular app.
