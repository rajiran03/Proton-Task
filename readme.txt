Proton Mail Folders and Labels:

I have automated the test cases for the Proton Mail Features [Folders and Labels ]using Eclipse IDE. 

Programming Language -JAVA

I run an automation test in Eclipse
Step 1 – Installing Java.
Step 2 – Installing the latest Eclipse version 2022 -09 R 
Step 3 – Selenium Client and WebDriver Language Bindings.
Step 4 – Configuring Selenium WebDriver With Eclipse.
Step 5 – Creating and Running the test using Selenium and Java.

Note :

I Choose Java as a programming Language because it is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible.
and Eclipse IDE is one of the most powerful integrated development environments (IDEs) ever built. 

I created in Maven project -Eclipse IDE, using the latest Eclipse version 2022 -09 R and installed latest version of Testng plugin.The TestNG Eclipse plug-in enables me to run my TestNG tests directly from Eclipse while easily monitoring the execution and output. It has its own repository called testng-eclipse that I used for this project.

1.BaseClass:

A base class is a class, in an object-oriented programming language, from which other classes are derived. It facilitates the creation of other classes that can reuse the code implicitly inherited from the base class (except constructors and destructors).
 Base class is a prerequisite. I have given the local path of my chromedriver where I did the installation and then it will redirect to the chrome page and open the proton folder and label page.

2.Testclass :

A test class is a normal Java class that is either public or package private. Setup and teardown methods must not be private and they must not return anything. A test method is a method that isn't private and doesn't return anything
I have used Public Class public is a Java keyword which declares a member's access as public. Public members are visible to all other classe .This means that any other class can access a public field or method. Further, other classes can modify public fields unless the field is declared as final .
In the test class, Proton mail will be logged in with user credentials and then it validate all the Main Features like the created folder and Created Label,Edit Folder and Edit Label to ensure that the functionality is functioning as expected using Assert
assert is a Java keyword used to define an assert statement. An assert statement is used to declare an expected boolean condition in a program. Here the program is running with assertions enabled, then the condition is checked at runtime. If the condition is false, the Java runtime system throws an AssertionError .

I have used The public keyword which is an access modifier used for classes, attributes,methods and constructors,making them accessible by other two classes like Base class and Homepage.

3.Homepage

This homepage provides a summary of everything it has to offer. One of the most typical functions of a homepage is as a directory.
I have used a constructor in Java which is a special method that is used to initialize objects.The constructor is called when an object of a class is created. I used Inheritance in Java to create a hierarchy between classes by inheriting from other classes, so I used homepage extends baseClass.to inherit attributes and methods from one class to another.

For exact location,I used %LocalAppData%" is an environmental variable that opens user account's "AppData\Local" folder " 
I used Chrome path rather than Relative path. I choose Absolute path, which means that the path will point to the root directory.
I have used public boolean here so it will check if new Folders and Labels are created or not then it will return a value of true or false based on that. 

Note :

I have covered almost all theFunctionality and have written test cases for every scenarios breifly for Folders and Labels feature for proton mail

