# 1. Estágio de Build (Usa a imagem do Maven para baixar as dependências e compilar o projeto)
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# 2. Estágio de Execução (Pega apenas o .jar gerado e roda no Java 17, deixando o sistema muito mais leve)
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
ENV PORT=8080
EXPOSE 8080

# O Segredo para o Free Tier do Render: Limitar o uso de RAM do Java!
ENTRYPOINT ["java", "-Xms128m", "-Xmx256m", "-jar", "app.jar"]