#基础镜像
FROM jiangnanjava/miniserver:latest

COPY build/libs/msc-consulserver.war /usr/local/tomcat/webapps
USER root
EXPOSE 8080
CMD ["catalina.sh", "run"]