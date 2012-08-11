#! /bin/sh
mvn clean package
cp target/mass-opinion-j2ee.war ~/Downloads/apache-tomcat-6.0.35/webapps/
