FROM tomcat:9.0.58

RUN rm -rf /usr/local/tomcat/webapps/ROOT

COPY target/simple-spring-webflow.war /usr/local/tomcat/webapps/ROOT.war

#Allow execution (Not required, just added)
CMD chmod +x /usr/local/tomcat/bin/catalina.sh

CMD ["catalina.sh", "run"]