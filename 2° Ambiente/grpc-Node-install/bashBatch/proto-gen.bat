@ECHO OFF
ECHO Congratulations! Batch file was executed successfully.

FOR %%i in ("%~dp0src\proto\*") do yarn proto-loader-gen-types --grpcLib=@grpc/grpc-js  --outDir=src/protoBuf/ %%i

PAUSE