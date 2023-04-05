FROM scratch
COPY ./build/native/nativeCompile/demo_spring_native /demo_spring_native
#CMD [ "sh", "-c", "./demo_spring_native" ]
CMD ["./demo_spring_native"]


#FROM gcr.io/distroless/base
#ADD ./build/native/nativeCompile/demo_spring_native /demo_spring_native
#ENTRYPOINT ["/demo_spring_native"]


#FROM alpine:3.17.3
#FROM ghcr.io/graalvm/graalvm-ce:22.3.1
#FROM oraclelinux:9-slim
#FROM gcr.io/distroless/base
#ADD . /app
#WORKDIR /app
#COPY build/native/nativeCompile /app
#COPY target/com.example.demo.DemoApplication /app
#RUN /app/demo_spring_native
# Add Spring Boot Native app spring-boot-graal to Container
#COPY "/build/native/nativeCompile/demo_spring_native" demo_spring_native
#CMD [ "sh", "-c", "./demo_spring_native" ]
#ENTRYPOINT ["/app"]