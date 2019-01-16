#!/bin/sh

mvn clean && mvn package
cp plugin-english/target/plugin-english-1.0-SNAPSHOT-plugin.jar app/src/main/plugins/         
cp plugin-chinese/target/plugin-chinese-1.0-SNAPSHOT-plugin.jar app/src/main/plugins/
