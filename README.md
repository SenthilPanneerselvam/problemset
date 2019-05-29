# Solution for the problem set

This project is a simple maven project with solutions for the problem set defined.

## Running the application using the command-line

This project can be built with [Apache Maven](http://maven.apache.org/). 
Pre-requisites: Java 1.8

Use the following steps to run the application locally:
After downloading the project, navigate to the root folder(where pom.xml file is available) in the command prompt.

1. Execute full Maven build to set up the project locally. This will also run the test cases completely.
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
