#!/bin/bash

yarn proto-loader-gen-types --grpcLib=@grpc/grpc-js  --outDir=src/protoBuf/ src/proto/*.proto