# OpenXava

Low-Code Platform for Rapid Development of Enterprise Web Applications. Write just the domain classes in plain Java. Get a web application ready for production.

Oficial web : https://www.openxava.org/

## Features

- No code generation: touch your code try your application in a few seconds.
- Although the User Interface is automatically generated (on fly) a fine tuning front-end arrangement is allowed.
- Adapted to work with legacy database schemas.
- Easy integration of reports made with JasperReports.
- Exhaustive documentation in English, French, Russian, Chinese and Spanish.

## Requirements

- java >= 1.8 on shell
- ant >= 1.9.15 on shell
- optional
  - maven >= 3.8.1 on shell
  - docker

Follow this guideline: https://github.com/rad-frameworks/openxava/wiki/Requirements---Linux

## Create new default project (Tested on LINUX)

- clone this repository
- Create a new project using shell and enter the desired name of your application or project
```
ant -f OpenXava/CreateNewProject.xml
```
- Open your new openxava project on your eclipse
- configure the database connection: `../persistence/META-INF/persistence.xml` and `../persistence/hibernate.config.xml`
  - by default hsqldb is used, change it to your desired database
- Create some pojo with jpa annotations classes in `src/com/yourcompany/fff/model`
- Run using the class `../src/_run/_Run_***.java`

## Create new onclick project (Tested on LINUX)

In this mode you are not a java developer and you want to use a pre-existent **MYSQL** database to create a ready to use web system without any touch of the source code.

**Note:** There is no magic, If your database use crazy, old or too new sql ddls, [Hibernate](https://hibernate.org/) and [JPA](https://docs.jboss.org/hibernate/annotations/3.5/reference/en/html/entity.html) will not be able to perform the reverse engineering required to create a ready to use web system. In this case, you need to research, learn and understand how these frameworks works:

- https://docs.jboss.org/hibernate/orm/5.0/mappingGuide/en-US/html/ch03.html
- https://docs.jboss.org/hibernate/jpa/2.1/api/javax/persistence/Column.html#columnDefinition()
- https://docs.jboss.org/tools/OLD/3.0.0.GA/en/hibernatetools/html/reverseengineering.html
- https://stackoverflow.com/questions/57019319/how-to-generate-model-code-for-single-db-using-hibernate-tools-through-hiberna
- https://stackoverflow.com/questions/23530013/netbeans-hibernate-reverse-engineering-data-types-mismatch

I advice you to use this [demo database](https://gist.github.com/maksbd19/cdb466fc7103efee1b8a7648ea153064) to learn how this frameworks works after the real usage on your complex database.

**Steps**

- clone this repository
- Create a new project using shell and enter the required information
```
export DISABLE_GALLERY_IMAGE=true
ant -f OpenXava/CreateNewProjectOneClick.xml
```
- If you are java developer: Open your new openxava project on your eclipse
- Run this command to perform a reverse engineering from tables to your java model
```
ant updateModel
```
- Build
```
ant compile
ant createWar -Ddist.base.dir=$(pwd)
```
- Run with jetty `ant runJetty`
- or run with docker `ant runDocker`
- If your project was called acme, you will have this ready to use: http://localhost:8080/acme
- User is admin and password admin

## Roadmap

- Usage of maven to avoid the huge download
- Modify to [hibernate-core](https://github.com/jrichardsz/hibernate-orm/tree/5.3.9-Final-Feature_env) to be able to use environment variables (instead harcoded values in persistence.xml or hibernate.cfg.xml) which is the best option for devops and automation purposes (a human will not necessary to change these values in the sever). This is used by [spring](https://stackoverflow.com/a/35535138/3957754) and a lot of platforms support it like [heroku](https://devcenter.heroku.com/articles/config-vars) because you can configure your application from outside, just sending the right variables
- Split this repository into several maven projects with its own github repository and publish them in https://mvnrepository.com/
  - Openxava -> openxava-core
  - Addons -> openxava-addons
  - ox-jdbc-adapters
- Improve the temaplte to suport more databases
- Document the usage of `JAVA_` variables to configure the tomcat server without touch it
- Modify jpa annotations and hibernate engine to support database comments and PK custom name. Currently comments are not suported and pks has random names.
- Add docker-compose
