FROM golang:1.25

WORKDIR /usr/src/myapp

COPY hello.go .

RUN go build -o hello hello.go

CMD ["./hello"]
