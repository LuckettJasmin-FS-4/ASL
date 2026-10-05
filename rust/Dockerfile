FROM rust:1.90

WORKDIR /usr/src/myapp

COPY hello.rs .

RUN rustc hello.rs -o hello

CMD ["./hello"]
