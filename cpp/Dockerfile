FROM gcc:15

WORKDIR /usr/src/myapp

COPY hello.cpp .

RUN g++ hello.cpp -o hello

CMD ["./hello"]
