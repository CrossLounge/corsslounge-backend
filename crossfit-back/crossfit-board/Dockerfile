# 베이스 이미지 설정
FROM openjdk:21

# 호스트 머신의 현재 디렉토리의 jar 파일을 컨테이너 내 /app 디렉토리로 복사
COPY build/libs/*.jar ./app.jar

# 컨테이너 실행 시 실행할 명령어 설정
CMD ["java", "-jar", "app.jar"]