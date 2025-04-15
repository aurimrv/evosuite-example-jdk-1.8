# EvoSuite Sample

Thie version is compilant with JDK 1.8. For more information about EvoSuite and its parameters, you may check the [official documentation](https://www.evosuite.org/documentation/commandline/).

## Compile Maven Project

```
cd Identifier
mvn clean compile
```

## Using EvoSuite to Generate Test Cases

```
java -jar ../lib/evosuite-1.0.6.jar -generateSuite -Dsearch_budget=60 -Dcriterion=branch -Dstopping_condition=MaxTime -target target/classes -Duse_separate_classloader=false
```

Command below will generate two folders:

 - evosuite-report: simple report with test case statistics
 - evosuite-tests: EvoSuite test cases

## Copying Generated Test to Maven Project Structure

```
cp -r evosuite-tests/* src/test/java/
```

## Compiling and Running Test Cases

```
mvn test-compile test
```

## Measuring Coverage and Mutation Score

```
mvn org.pitest:pitest-maven:mutationCoverage
```

Command below will create a folder `target/pit-reports` with coverage and mutation score reports in XML, CSV and HTML formats.