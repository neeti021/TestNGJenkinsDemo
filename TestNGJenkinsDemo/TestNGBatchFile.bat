set projectLocation=C:\Jenkins_Integration\TestNGJenkinsDemo
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause