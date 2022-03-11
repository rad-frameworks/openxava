## Steps

- create project
ant -f OpenXava/CreateNewProjectOneClick.xml
- create database
ant "updateSchema" -f demo/build.xml
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

## Fixes

Nowadays, nobody uses the database for binaries or images
```
export DISABLE_GALLERY_IMAGE=true
```
