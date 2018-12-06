#!/bin/bash

## java env
export JAVA_HOME=/root/install/jdk1.8.0_181
export JRE_HOME=$JAVA_HOME/jre

## service name
SERVICE_DIR=/usr/jar
## 服务名称
SERVICE_NAME=core-web-service
JAR_NAME=$SERVICE_NAME\.jar
PID=$SERVICE_NAME\.pid
cd $SERVICE_DIR

case "$1" in

    start)
        ##nohup &  以守护进程启动
        nohup $JRE_HOME/bin/java -Xms256m -Xmx512m -jar $JAR_NAME >/dev/null 2>&1 &
        echo $! > $SERVICE_DIR/$PID
        echo "=== start $SERVICE_NAME"
        ;;

    stop)
        kill `cat $SERVICE_DIR/$PID`
        rm -rf $SERVICE_DIR/$PID
        echo "=== stop $SERVICE_NAME"

        ## 停止5秒
        sleep 5
        ##
        P_ID=`ps -ef | grep -w "$SERVICE_NAME" | grep -v "grep" | awk '{print $2}'`
        if [ "$P_ID" == "" ]; then
            echo "=== $SERVICE_NAME process not exists or stop success"
        else
            echo "=== $SERVICE_NAME process pid is:$P_ID"
            echo "=== begin kill $SERVICE_NAME process, pid is:$P_ID"
            kill -9 $P_ID
        fi
        ;;

    restart)
        $0 stop
        sleep 2
        $0 start
        echo "=== restart $SERVICE_NAME"
        ;;

    *)
        ## restart
        $0 stop
        sleep 2
        $0 start
        ;;

esac
exit 0