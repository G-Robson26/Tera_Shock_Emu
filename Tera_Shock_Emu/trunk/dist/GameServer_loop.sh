#!/bin/bash
while :;
do
        java -server -Dclient.encoding.override=UTF-8 -Dfile.encoding=UTF-8 -XX:-UseParallelGC -Xmx4096m -cp ./libs/*:stera.jar tera.gameserver.GameServer >/dev/null 2>&1
                gspid=$!
                echo ${gspid} > gameserver.pid
                [ $? -ne 2 ] && break
        sleep 10;
done
