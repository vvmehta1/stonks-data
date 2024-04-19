FROM bitnami/wildfly:31.0.0
ADD target/stonksdata.war /opt/bitnami/wildfly/standalone/deployments/
ENV WILDFLY_PASSWORD="password"
