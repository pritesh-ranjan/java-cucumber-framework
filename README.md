# Java Cucumber Maven Test Automation Framework

A powerful and flexible test automation framework that utilizes the power of Java, Cucumber, and maven as a build tool to test RESTful APIs using behavior-driven development (BDD) methodology.

We will be testing https://restful-api.dev/.

## Key Features
- Maintains test context between steps
- Uses REST-Assured for API testing
- Generates Cucumber reports for test results
- Implements BDD methodology

## Prerequisites
- Java 8 or later
- Maven 4.0 or later
- IntelliJ IDEA or Eclipse

## Getting Started
1. Clone the repository
2. Open the project in IntelliJ IDEA or Eclipse
3. Run the command `mvn clean test` in the root directory of the project

## How to run tests
1. Clone the repository
2. Open the project in IntelliJ IDEA or Eclipse
3. Run the command `mvn clean test` in the root directory of the project

## Framework Structure
The framework is structured in the following way:
- `src/main/java`: contains abstract classes, test context, utilities, models, constants and config reader
- `src/main/resources`: contains the feature files and test data
- `src/test/java`: contains the step definitions and test runners
- `pom.xml`: contains the dependencies and build configuration

## Test Context
Test context is implemented using the Singleton pattern and the Factory pattern. Test context classes are located in the `src/main/java` directory and are used to store and retrieve test data between steps.

## API Testing
API testing is done using REST-Assured library. The REST-Assured library is used to make HTTP requests and to verify the responses.

## Behavior Driven Development
The framework uses Cucumber to implement BDD. The feature files are located in the `src/test/resources` directory and the step definitions are located in the `src/test/java` directory.

## Reporting
Cucumber reporting is integrated with the framework. After running the tests, the report can be found in the `target/cucumber-reports` directory.

## Extensibility
The framework is built to be easily extensible and can be integrated with other testing libraries and frameworks.

