# WSO2 TestGrid supported sample TestNG test

> This repository contains files to create a simple TestNG tests-jar which is accepted by WSO2 TestGrid.
## Approach
1. All the test classes are written inside src/test/java
2. The test-jar should contain all the dependencies necessary to run the tests.
   * Maven plugins used:
     - maven-compiler-plugin
     - maven-assembly-plugin
   * Path to assembly descriptor file : 
     - src/main/assembly/assembly.xml
     
## Try out the sample:
1. Clone the repository
2. Build the project
3. Obtain the tests-jar from target/sample.testng.test-1.0-SNAPSHOT-tests-jar-with-dependencies.jar
