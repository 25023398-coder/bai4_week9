#!/bin/bash

set -e

echo "--- 1. Dang kiem tra Checkstyle ---"
mvn checkstyle:check

echo "--- 2. Dang bien dich va dong goi (.jar) ---"
mvn clean package

echo "--- 3. Dang chay ung dung chinh ---"
mvn exec:java -Dexec.mainClass="com.banksystem.Main"