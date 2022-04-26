# Asgn1

The first programming assignment involves writing a program that computes the minimum, the
maximum and the average weight of three weights represented in pounds and ounces, and the
values for the weight will be hard coded within the program. This program consists of two
classes.

The first class is the Weight class, and this class will have two instance variables. The name of
the first valuable is “pounds”, and the data type is of integer. The name of the second variable is
“ounces”, and the data type is a double precision floating point number. Both the instance
variables must be private.

The Weight class should have four public methods and two private methods, which are as
follows:

1. A public constructor that allows the pounds and ounces to be initialized to the values
supplied as parameters.

2. A public instance method named lessThan that accepts one weight as a parameter and
returns whether the weight object on which it is invoked is less than the weight supplied
as a parameter.

3. A public instance method named addTo that accepts one weight as a parameter and adds
the weight supplied as a parameter to the weight object on which it is invoked. It should
normalize the result.

4. A public instance toString method that returns a string that looks as follows: x lbs y oz,
where x is the number of pounds and y the number of ounces. The number of ounces
should be displayed with two places to the right of the decimal. You will use this method
to print out the weight for display purposes.

5. A private instance method toOunces that returns the total number of ounces in the weight
object on which it was invoked. This private method will be used (re-used) within the
Weight class to help with various computations.

6. A private instance method normalize that normalizes the weight on which it was
invoked by ensuring that the number of ounces is less than the number of ounces in a
pound. This private method will be used (re-used) within the Weight class to help with
various computations.

In addition, the class should contain a private named constant that defines the number of ounces
in a pound, which is 16. This class must not contain any other public methods.
The second class should be named Project1. It should consist of the following four class (static)
methods.

1. A private class method named findMinimum that accepts the three instances of Weight as
the parameters and returns the weight that is the smallest. The display will include the
values of the three weights, and which one is the minimum. Use the toString() for the
display.

2. A private class method named findMaximum that accepts the three instances of Weight as
the parameters and returns the weight that is the highest. The display will include the
values of the three weights, and which one is the maximum. Use the toString() for the
display.

3. A private class method named findAverage that accepts the three instances of Weight as
the parameters and returns the average weight. The display will include the values of the
three weights, and the value for the average. Use the toString() for the display.
