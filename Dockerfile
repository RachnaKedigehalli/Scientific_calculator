FROM openjdk:11
ADD target/Scientific_calculator-1.0.jar ScientificCalculator.jar
ENTRYPOINT ["java", "-jar", "ScientificCalculator.jar"]