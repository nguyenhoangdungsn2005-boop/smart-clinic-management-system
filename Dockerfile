# ✅ 1. Chọn base image chứa JDK
FROM openjdk:17-jdk-slim

# ✅ 2. Đặt thư mục làm việc trong container
WORKDIR /app

# ✅ 3. Copy file .jar (build từ Maven) vào container
COPY target/smart-clinic-management-system-0.0.1-SNAPSHOT.jar app.jar

# ✅ 4. Expose cổng mà Spring Boot chạy
EXPOSE 8080

# ✅ 5. Lệnh khởi chạy ứng dụng
ENTRYPOINT ["java", "-jar", "app.jar"]
