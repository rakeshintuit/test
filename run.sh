#!/usr/bin/env bash
mvn clean compile
mvn dependency:copy-dependencies
docker rmi functional-test
docker image build -t functional-test .
docker run functional-test
