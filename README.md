Run the below command in target folder after moving the src/test/resources folder to target folder

java -cp selenium-docker.jar;selenium-docker-tests.jar;libs/* -Dcucumber.options=classpath:features org.junit.runner.JUnitCore com.runner.JUnitTestRunner
java -cp selenium-docker.jar;selenium-docker-tests.jar;libs/* -Dcucumber.options=classpath:features org.testng.TestNG -testclass com.runner.TestRunner
java -cp selenium-docker.jar;selenium-docker-tests.jar;libs/* -Dcucumber.options=classpath:features org.testng.TestNG ../testng.xml