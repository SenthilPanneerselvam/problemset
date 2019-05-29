# Solution for the problem set

This project is a simple maven project with solutions for the problem set defined.

## Running the application using the command-line

This project can be built with [Apache Maven](http://maven.apache.org/). 
Pre-requisites: Java 1.8

Use the following steps to run the application locally:

1. Execute full Maven build to create the `target/JavaHelloWorldApp.war` file:
    ```bash
    $ mvn clean install
    ```

2. Use the following command to run the test cases:
    ```bash
    $ mvn test
    ```
## Test with your input

1. The solutions are written to listen the system in for inputs. There are three Java files with main class
    BalancedStringSolution
    MaximumDifferenceSolution
    MovieTitlesSolution

2. All these java classes has a main method, which receives the input in the format defined in the problem set from the system in.

3. Running the main method with proper inputs will print the outputs in the system out.
