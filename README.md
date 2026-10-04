# ASL - Exploring Other Languages With Docker

This repository contains my Docker assignment for the ASL course. The purpose of this project is to explore multiple server-side programming languages by creating and running each language inside its own Docker container.

## Programming Languages

This project includes four programming languages:

- Python
- PHP
- Ruby
- Java

Each language has its own directory, source file, and Dockerfile.

## Project Structure

    ASL/
    ├── java/
    │   ├── Dockerfile
    │   └── HelloASL.java
    ├── php/
    │   ├── Dockerfile
    │   └── hello.php
    ├── python/
    │   ├── Dockerfile
    │   └── hello.py
    ├── ruby/
    │   ├── Dockerfile
    │   └── hello.rb
    └── README.md

## Program Requirements

Each Docker container runs a program that displays:

    Hello ASL!
    Current Date: YYYY-MM-DD HH:MM:SS

This demonstrates that each programming language is successfully running inside its own Docker container.

## Docker Images

The following Docker images were created:

- `asl-python`
- `asl-php`
- `asl-ruby`
- `asl-java`

## Running the Containers

### Python

    cd python
    docker build -t asl-python .
    docker run --name asl-python-container asl-python

### PHP

    cd php
    docker build -t asl-php .
    docker run --name asl-php-container asl-php

### Ruby

    cd ruby
    docker build -t asl-ruby .
    docker run --name asl-ruby-container asl-ruby

### Java

    cd java
    docker build -t asl-java .
    docker run --name asl-java-container asl-java

Java is a compiled language, so the Java Dockerfile compiles `HelloASL.java` using `javac` before running the program.

## Expected Output

Each container produces output similar to:

    Hello ASL!
    Current Date: 2026-10-04 02:48:04

## Docker Containers

The completed project includes four separate containers:

- `asl-python-container`
- `asl-php-container`
- `asl-ruby-container`
- `asl-java-container`

All four containers successfully execute their programs and exit with status code `0`.

## Git Branch

This assignment is maintained on the required topic branch:

`assignments/docker`

## Author

**Jasmin Luckett**

Full Sail University  
Advanced Server-Side Languages (ASL)
