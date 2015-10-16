![alt text](http://cdn0.agoda.net/images/MVC/default/logo-agoda-mobile@2X.png "agoda")

Scala Programming
===================
Congradulations, you have passed the first step in interviewing with us. The next phase will be to take short exercises in programming.
<br/>

In this exercise we would like you to exprience with Scala programming language which is a functional programming language.
<br />

Follow the instructions of the exam below, and produce the given results in Scala. You may use Pull requests from your Git account or send it to us back on e-mail
<br/>

Please take your time, the exam is not hard and we don't need the result. We need to see how you code.
<br/>

The first you have to do is install "SBT" [http://www.scala-sbt.org] on your machine.<br />
The second is implement <b>Scala</b> code and test.<br />
<br/>
There's some Scala information here:
http://www.scala-lang.org/documentation/getting-started.html

<br/>

Exam
-----
<pre>
1. Create diamond shape follow by "n". (n is odd value only)
val d3 = DiamondShape(3)
d3.printDiamond() 
----------------------------------------------------------------
  +
+ + +
  +


val d5 = DiamondShape(5)
d5.printDiamond()
----------------------------------------------------------------
    +
  + + +
+ + + + +
  + + +
    +
</pre>

<pre>
Create butterfly shape follow by "n". (n is even value only)
val b2 = ButterflyShape(2)
b2.printButterfly() 
----------------------------------------------------------------
+       +
+ + - + +
+       +


val b4 = ButterflyShape(4)
b4.printButterfly()
----------------------------------------------------------------
+               +
+ +           + +
+ + +       + + +
+ + + + - + + + +
+ + +       + + +
+ +           + +
+               +
</pre>



Software Library
-----
 1. SBT
 -  JDK 1.7 up
 -  GIT




```Build_Run
 > sbt compile
 
 > sbt test
 
```





All material herein © 2005 – 2014 Agoda Company Pte. Ltd., All Rights Reserved.<br />
AGODA ® is a registered trademark of AGIP LLC, used under license by Agoda Company Pte. Ltd.<br />
Agoda is part ofPriceline (NASDAQ:PCLN)<br />
