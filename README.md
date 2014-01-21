ITM411 Mini-Project 1
=====================

Project Description
-------------------

For my Java course, Fall 2012. We created 20 different instances of the tablet class consisting of the 3 popular available tablets: the iPad, Galaxy and Nexus. Each instance is assigned random real spec values that were specified; taken directly from their respective maker’s website. In randomizing the instances, I actually used some conditional statements to create actual models (as opposed to random values for each field).

Installation, Compile and Run-Time Requirements
-----------------------------------------------

Written in Java using JDK 1.7.0_07, this project was created in Netbeans IDE 7.2. The computer I’m using is a MacPro, with 2x2GHz Dual-Core Intel Xeon processors with 9GB of 667MHz DDR2 RAM and running OS X Lion 10.7.4.

Screen Capture
--------------

![output](https://raw.github.com/villanuv/java_mp1/master/screen.jpg)

The first 20 lines are output using the toString method and consist of the tablet class with fields that are randomly selected. But again, based on actual value combinations that are offered for each iPad, Galaxy and Nexus tablet.

The next 3 lines are output from abstract methods and used to compare random output values for each of the required fields in the assignment. That is: largest display, lowest cost and lightest weight. I actually formatted these somewhat better, so that it’s more legible. However, I wonder why .00 is only showing one zero.

The last 4 lines are showing the total count of tablet arrays or objects that are created from the methods, also broken down by product family.