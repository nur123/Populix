ini jawaban soal Make all possible test case for this page

Scenario: Login in Google

Given user is on homepage
When user click Google Login button
When user input Google email
When user click Berikutnya
When user input Password gmail
When user click Berikutnya
Then user is on pre-screening page


Scenario: Login Facebook

Given user is on homepage
When user click Facebook Login button
When user input email facebook
When user input password facebook
When user click Log in button
Then user is on authorization page
When user click Lanjutkan
Then user is on pre-screening page


Scenario: Daftar

Given user is on homepage
When user click link Daftar
When user input Nama Depan
When user input Nama Belakang
When user input Alamat Email
When user input Kata Sandi
When user click Daftar button
Then user is in Confirm page
When user input OTP
When user click Submit button
Then user is on pre-screening page


Scenario: Login Manual

Given user is on homepage
When user input registered Alamat email
When user input Password
When user input Masuk button
Then user is on pre-screening page


Scenario: Lupa Kata Sandi

Given user is on homepage
When user click link Lupa Kata Sandi?
When user input Alamat email
When user click Kirim Ulang Kata Sandi
Then user is on change-password page
When user input Kode verifikasi
When user input Password baru
When user input Konfirmasi Password baru
When user click Kirim Kata Sandi button
Then user success change password and return to homepage 

Dari script manual ini yang bisa di buatkan automationnya adalah
login dengan facebook dan login manual 

untuk step by stepnya :
1. Install JDK 1.8
2. Install Maven 
3. Install Intellij 
4. Install Plugin Cucumber-java pada intellij
5. kemudian tambahkan pom.xmlnya : 

<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
<modelVersion>4.0.0</modelVersion>

    <groupId>com.populix</groupId>
    <artifactId>Populix</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <packaging>jar</packaging>

    <name>populix</name>
    <url>http://maven.apache.org</url>

    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <maven.compiler.source>1.8</maven.compiler.source>
        <maven.compiler.target>1.8</maven.compiler.target>
    </properties>

    <dependencies>

        <dependency>
            <groupId>com.aventstack</groupId>
            <artifactId>extentreports-cucumber4-adapter</artifactId>
            <version>1.0.8</version>
            <exclusions>
                <exclusion>
                    <groupId>io.cucumber</groupId>
                    <artifactId>cucumber-java</artifactId>
                </exclusion>
                <exclusion>
                    <groupId>io.cucumber</groupId>
                    <artifactId>cucumber-core</artifactId>
                </exclusion>
            </exclusions>
        </dependency>

        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13</version>
            <!-- <version>3.8.1</version> -->
        </dependency>

        <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-java -->
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-java</artifactId>
            <version>4.8.1</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-junit -->
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-junit</artifactId>
            <version>4.8.1</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>3.141.59</version>
        </dependency>
        <dependency>
            <groupId>commons-io</groupId>
            <artifactId>commons-io</artifactId>
            <version>1.4</version>
            <scope>test</scope>
        </dependency>

        <!-- https://mvnrepository.com/artifact/com.github.seratch/jslack -->
        <dependency>
            <groupId>com.github.seratch</groupId>
            <artifactId>jslack</artifactId>
            <version>3.4.2</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.apache.httpcomponents/httpclient -->
        <dependency>
            <groupId>org.apache.httpcomponents</groupId>
            <artifactId>httpclient</artifactId>
            <version>4.5.2</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/org.apache.httpcomponents/httpmime -->
        <dependency>
            <groupId>org.apache.httpcomponents</groupId>
            <artifactId>httpmime</artifactId>
            <version>4.5.2</version>
        </dependency>

    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.8.1</version>
                <configuration>
                    <source>1.8</source>
                    <target>1.8</target>
                </configuration>
            </plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-resources-plugin</artifactId>
                <version>3.1.0</version>
            </plugin>
        </plugins>
    </build></project>

untuk runningnya bisa di running di dalam package testuite
ada 2 testsuite yaitu TSuitesLoginFacebook dan TSuitesLoginManual

Jawaban yang B : 

#!/bin/bash
#login.sh

username="qa"
password="engineer"

read -p "Username : " logusername
read -sp "Password : " logpassword
echo

if [ $username == $logusername ] && [ $pass == $logpassword ]
then
echo "Login success"
else
echo "Login failed"
fi	

Jawaban yang D :
D. regression test => A regression test is usually a test that is activity performed to ensure the different functionalities of the system are still working as expected and the new functionalities added did not break any of the existing ones. This could be combination of API/UI/Unit tests that are run periodically.

non regression test => Non-regression tests based on the context of your project could mean so many different things like Smoke Tests or Unit Tests that are run during every code check in. It could also means story level testing performed when testing a particular feature/requirement in a story. It could also be security testing, load testing, stress testing that are performed at some point of the the development lifecycle.

Jawaban yang C :
C. test suite => is a list of related test cases. Suite may contain common initialization and cleanup routines specific to the cases included.

test case =>  is a set of test inputs, execution conditions, and expected results developed to test a particular execution path. Usually, the case is a single method.

test step => This is documentation that describes the execution steps and the expected results for each of the test steps. After the final outcome, based on the comparison, the steps are marked pass and fail.

