./gradlew clean build -x test
docker build . -t 8881981/cat:1
docker push 8881981/cat:1
