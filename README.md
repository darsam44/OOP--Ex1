# OOP--Ex1
This project is a continue of ex0 project. 
In this project we have 4 main class every class represents diffrent kind of object, the class are:

1. ComplexFunction- this class represents object that is a complex of 2 function. left function and right function and operation between
them.the operation are : plus, times, divid, max, min, comp, none and error. 
2. Function_Gui- this class role is to draw the function graph, we used the stdDraw to draw the garph. 
3. Monom- this class represnets a monom object.
4. Polynom-this class represents a polynom object. 

ComplexFunction:

this class include the forward function: ComplexFunction (String op, function left , function right),  ComplexFunction (String s),
ComplexFunction (function left), f(double x), initFromString(String s), copy, plus(function f1), mul(function f1), div(function f1), 
max(function f1), min(function f1), comp(function f1), left, right, getOp, equals(Object other), toString(). 

Notice: 

* we find a problem in equals function, if we will get:

f1=none(x^2+4,0), f2=plus(x^2,4) 
the 2 function are equals but we won't get true.
the solution is: we will place numbers in the function in some range and check if all the answer are the same in all the places,
if it does we will able to tell that
the 2 function are equals. 

Monom:

The class Monom  represents  a simple monom in a shape a*x^b . this class include the forwards function :
constructor , get_power, get_coefficient, derivative, f , isZero, 
Monom, add, multiply, toString , equals and so on. 
End cases :
if we will insert the input  like : “8+9”, “.3”, “4x+8” we will get an run time exception,
cause the function represents a monom for the shape a*x^b (a=double number, b=int number).

Notice:

* we will get an input like "+8x^2"

Polynom:

The class Polynom represent a simple polynom in the shape:
a*x^b+c*x^d+… (a,c=double numbers, b,d=int numbers)  the polynom is a complex of monoms therefore we decided to represent the object polynom from an arraylist of monoms 

End cases:
if we will insert the input “3x^2+6+7^2” we will get run time exception , cause the string “7^2” isn’t a monom.

Notice:

* we will get an input like "+8x^2-9"



