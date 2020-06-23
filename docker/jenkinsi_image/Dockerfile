FROM jenkins/jenkins:latest

RUN /usr/local/bin/install-plugins.sh git matrix-auth workflow-aggregator build-name-setter credentials-binding timestamper sonar build-pipeline-plugin jenkins-multijob-plugin subversion

USER root

RUN apt-get update 
RUN apt-get install wget -y
RUN apt-get install unzip -y
RUN mkdir /opt/gradle/
RUN mkdir /opt/ant/
RUN mkdir /opt/maven
RUN wget https://downloads.gradle-dn.com/distributions/gradle-4.10.3-all.zip
RUN wget https://downloads.apache.org//ant/binaries/apache-ant-1.9.15-bin.zip
RUN wget https://downloads.apache.org/maven/maven-3/3.6.3/binaries/apache-maven-3.6.3-bin.zip
RUN ls
RUN unzip -d /opt/gradle/ gradle-4.10.3-all.zip
RUN unzip -d /opt/maven/ apache-maven-3.6.3-bin.zip
RUN unzip -d /opt/ant/ apache-ant-1.9.15-bin.zip
RUN export PATH=$PATH:/opt/gradle/gradle-4.10.3/bin
RUN export PATH=$PATH:/opt/maven/apache-maven-3.6.0-bin/bin/
RUN export PATH=$PATH:/opt/ant/apache-ant-1.10.5/bin/
RUN mkdir /var/logs
RUN rm apache-ant-1.9.15-bin.zip apache-maven-3.6.3-bin.zip gradle-4.10.3-all.zip
ENV JENKINS_USER admin
ENV JENKINS_PASS admin

# Skip initial setup
ENV JAVA_OPTS -Djenkins.install.runSetupWizard=false

USER jenkins

COPY executors.groovy /usr/share/jenkins/ref/init.groovy.d/
COPY default-user.groovy /usr/share/jenkins/ref/init.groovy.d/