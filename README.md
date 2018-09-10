# TC-COMPONENTS

## Requirements
- JDK >=1.5
- Maven 3.5

## Initialise submodules.
```
cd tc-java-components
git submodule update --init
```

## Install Additional Libraries

#### job_scheduler
```
mvn install:install-file -Dfile=lib/job_scheduler.jar -DgroupId=com.topcoder.internal -DartifactId=job_scheduler -Dversion=1.0.0 -Dpackaging=jar
```

#### core.api
```
mvn install:install-file -Dfile=lib/core.api.jar -DgroupId=com.topcoder.internal -DartifactId=core.api -Dversion=4.3.0 -Dpackaging=jar
```

#### tcwebcommon
```
mvn install:install-file -Dfile=lib/tcwebcommon.jar -DgroupId=com.topcoder.internal -DartifactId=tcwebcommon -Dversion=1.0.0 -Dpackaging=jar
```

#### forums
```
mvn install:install-file -Dfile=lib/forums.jar -DgroupId=com.topcoder.internal -DartifactId=forums -Dversion=1.0.0 -Dpackaging=jar
```

#### online_review
```
mvn install:install-file -Dfile=lib/or.jar -DgroupId=com.topcoder.internal -DartifactId=online_review -Dversion=1.0.0 -Dpackaging=jar
```


## Configuring Repository
Edit `pom.xml` add topcoder internal private repository inside `repositories`
```
<repository>
	<id>{repo's name}</id>
	<url>{url}</url>
	<snapshots>
	<enabled>true</enabled>
	<updatePolicy>always</updatePolicy>
	</snapshots>
</repository>
```

## Build All Modules
```
mvn clean package -Dmaven.test.skip=true
```

## Install All Modules to Local Maven Repository
```
mvn clean install -Dmaven.test.skip=true
```

## Build Individual Module
```
cd <module directory>
mvn clean package -Dmaven.test.skip=true
```
