# ASL - Exploring Other Languages With Docker

This repository contains my Exploring Other Languages With Docker assignment for the ASL course.

The purpose of this project is to explore multiple server-side programming languages by creating and running each language inside its own Docker container.

## Programming Languages

This project demonstrates all nine programming languages listed on the assignment score sheet:

- Python
- PHP
- Ruby
- Java
- Rust
- C++
- Lua
- GoLang
- NodeJS

Each language has its own directory, source file, and Dockerfile.

## Project Structure

    ASL/
    ├── cpp/
    │   ├── Dockerfile
    │   └── hello.cpp
    ├── golang/
    │   ├── Dockerfile
    │   └── hello.go
    ├── java/
    │   ├── Dockerfile
    │   └── HelloASL.java
    ├── lua/
    │   ├── Dockerfile
    │   └── hello.lua
    ├── nodejs/
    │   ├── Dockerfile
    │   └── hello.js
    ├── php/
    │   ├── Dockerfile
    │   └── hello.php
    ├── python/
    │   ├── Dockerfile
    │   └── hello.py
    ├── ruby/
    │   ├── Dockerfile
    │   └── hello.rb
    ├── rust/
    │   ├── Dockerfile
    │   └── hello.rs
    └── README.md

## Program Requirements

Each Docker container runs a program that displays:

    Hello ASL!
    Current Date: YYYY-MM-DD HH:MM:SS

This demonstrates that each programming language successfully runs inside its own Docker container.

## Docker Images

The following Docker images were created:

- `asl-python`
- `asl-php`
- `asl-ruby`
- `asl-java`
- `asl-rust`
- `asl-cpp`
- `asl-lua`
- `asl-golang`
- `asl-nodejs`

## Docker Containers

The completed project includes nine separate containers:

- `asl-python-container`
- `asl-php-container`
- `asl-ruby-container`
- `asl-java-container`
- `asl-rust-container`
- `asl-cpp-container`
- `asl-lua-container`
- `asl-golang-container`
- `asl-nodejs-container`

Each container successfully prints the required greeting and current date.

## Compiled Languages

Java, Rust, C++, and GoLang are compiled during their Docker image builds before their programs are executed.

## Expected Output

Each container produces output similar to:

    Hello ASL!
    Current Date: 2026-10-05 01:55:37

## Assignment Score Coverage

| Language | Print String | Print Date | Total |
|---|---:|---:|---:|
| PHP | 10 | 10 | 20 |
| Ruby | 10 | 10 | 20 |
| Python | 10 | 10 | 20 |
| Lua | 10 | 10 | 20 |
| NodeJS | 5 | 5 | 10 |
| Rust | 20 | 20 | 40 |
| C++ | 20 | 20 | 40 |
| Java | 20 | 20 | 40 |
| GoLang | 20 | 20 | 40 |
| **Total** | **105** | **105** | **210** |

## Git Branch

This assignment is maintained on the required topic branch:

`assignments/docker`

## Author

**Jasmin Luckett**

Full Sail University  
Advanced Server-Side Languages (ASL)
