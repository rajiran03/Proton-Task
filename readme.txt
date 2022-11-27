Proton Mail -Folder and Label

In Eclipse, I installed the Testng Plugin.
The TestNG Eclipse plug-in enables me to run my TestNG tests directly from Eclipse while easily monitoring the execution and output. It has its own repository called testng-eclipse that I used for this project.
I ran this java in Maven Project -Eclipse IDE, using the latest Eclipse version 2022 -09 R and the latest version of Testng plugin.

1.BaseClass:
 Base class is a prerequisite in base CSS I have given the local path of my chromedriver where I did the installation and then it will redirect to the chrome page and open the proton folder and label page 

2.Testclass :
In the test class, Proton mail will be logged in with user credentials and then validated.the created folder and Created Label,Edit Folder and Edit Label to ensure that the functionality is functioning as expected.

3.homepage
This is the main part of the class that constructs the methods. I used Inheritance in Java to create a hierarchy between classes by inheriting from other classes, so I used homepage extends baseClass.to inherit attributes and methods from one class to another.
For exact location, I used Chrome path rather than Relative path. I chose Absolute path, which means that the path will point to the root directory.

Note :
I have written test cases for every scenario in the Folders and Labels feature for proton mail

