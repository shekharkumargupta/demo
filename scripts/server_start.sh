#!/usr/bin/env bash
cd /var/demo-app/
sudo /usr/bin/java -jar -Dserver.port=80 \
    *.jar > /dev/null 2> /dev/null < /dev/null &
