## Steps

- create project
ant -f OpenXava/CreateNewProjectOneClick.xml
- create database
ant "updateSchema" -f demo/build.xml
- generate model
cd $projet/hbm2java
mvn clean hibernate3:hbm2java
- build
- deploy

https://www.codejava.net/frameworks/hibernate/how-to-customize-hibernate-reverse-engineering-code-generation  
https://docs.jboss.org/tools/latest/en/hibernatetools/html/reverseengineering.html
https://github.com/tguerin/reveng/blob/master/reveng/src/main/resources/hibernate.reveng.xml
https://stackoverflow.com/questions/25523037/what-is-use-of-hibernate-reveng-xml-and-i-dont-knows-how-to-setup-hibernate-in-m

http://gencat.github.io/docs-canigo-v2/CAN/Servei%20de%20persist%C3%A8ncia%202.3.x_attachments/hibernate_tools.pdf
https://stackoverflow.com/questions/50659187/hibernate-gradle-ant-cannot-find-hibernate-reveng-xml


https://docs.jboss.org/tools/OLD/3.0.0.GA/en/hibernatetools/html_single/index.html
https://forum.hibernate.org/viewtopic.php?p=2423722
https://github.com/hibernate/hibernate-tools/blob/master/ant/src/main/java/org/hibernate/tool/ant/HibernateToolTask.java

https://developer.jboss.org/thread/196280
https://forum.hibernate.org/viewtopic.php?p=2423722
https://sites.google.com/site/struts2spring/hibernate-x/hbm2java
https://stackoverflow.com/questions/2083727/how-to-configure-maven-hbm2hbmxml-and-hbm2java-to-run-one-after-the-other-in-mvn
https://gist.github.com/lotabout/34566cb1f2d2038c55e1
https://docs.jboss.org/tools/OLD/3.0.0.GA/en/hibernatetools/html/reverseengineering.html
https://stackoverflow.com/questions/57019319/how-to-generate-model-code-for-single-db-using-hibernate-tools-through-hiberna

HibernateToolTask revenge

## Fixes

Nowadays, nobody uses the database for binaries or images
```
export DISABLE_GALLERY_IMAGE=true
```
