@echo off
set basedir=D:\develop\wms\workspace\wms
echo basedir=%basedir%

echo ----------------------package--------------------
rem call mvn -f %basedir%/wms-startup-tomcat/pom.xml clean package
call ant -f wms.xml wms-service-deploy

pause
