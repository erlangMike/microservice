#精简版基础镜像 目前bi在用
FROM tomcat:9.0.5-jre8-alpine

#作者
MAINTAINER 姜楠 <jiangnan.java@hotmail.com>

#定义工作目录
ENV WORK_PATH /usr/local/tomcat/conf

ENV JAVA_OPTS -Duser.timezone=Asia/Shanghai

#定义要替换的server.xml文件名
#ENV SERVER_CONF_FILE_NAME server.xml


#删除原文件server.xml
#RUN rm $WORK_PATH/$SERVER_CONF_FILE_NAME

#复制文件server.xml
#COPY  ./$SERVER_CONF_FILE_NAME $WORK_PATH/
#COPY  ../../compose/docker-compose.yml $WORK_PATH/


# Install base packages
RUN apk update && apk add curl bash tree tzdata \
    && cp -r -f /usr/share/zoneinfo/Asia/Shanghai /etc/localtime \
    && echo -ne "Alpine Linux 3.4 image. (`uname -rsv`)\n" >> /root/.built