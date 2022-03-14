FROM tomcat:8.5
COPY @project@.dist/@project@.war /usr/local/tomcat/webapps/
ADD entrypoint.sh /entrypoint.sh
RUN chmod 744 /entrypoint.sh
# override defaul entrypoint
# https://github.com/docker-library/tomcat/blob/master/8.5/jdk8/openjdk-buster/Dockerfile#L150
ENTRYPOINT ["/entrypoint.sh"]
