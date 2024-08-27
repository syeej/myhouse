# ENTRYPOINT ["top", "-b"]

# 빌드
FROM openjdk:17-jdk-slim AS build
WORKDIR /app
COPY . .
RUN chmod +x ./gradlew
RUN ./gradlew build --no-daemon -x test

# 실행
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/build/libs/*.jar app.jar
EXPOSE 8087
CMD ["java", "-jar", "app.jar", "--spring.profiles.active=prod"]