#基础镜像
FROM jiangnanjava/miniserver:latest

COPY libs/ms-bi.war /usr/local/tomcat/webapps
COPY server.xml /usr/local/tomcat/conf
USER root
EXPOSE 8080
CMD ["catalina.sh", "run"]