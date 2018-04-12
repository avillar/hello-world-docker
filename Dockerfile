FROM tomcat:8.5

EXPOSE 8080

RUN ["rm", "-rf", "/usr/local/tomcat/webapps/ROOT"]

COPY target/diremweb-backend.war /usr/local/tomcat/webapps/ROOT.war

CMD ["catalina.sh", "run"]