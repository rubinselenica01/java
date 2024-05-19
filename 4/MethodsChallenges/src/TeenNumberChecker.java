/*

We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).

Write a method named hasTeen with 3 parameters of type int.

The method should return boolean, and it needs to return true if one of the parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return false.

Write another method named isTeen with 1 parameter of type int.

The method should return boolean, and it needs to return true if the parameter is in range 13(inclusive) - 19 (inclusive). Otherwise return false.
 NOTE: All methods need to be defined as public static ​like we have been doing so far in the course.
NOTE: Do not add a  main method to solution code.
 */

public class TeenNumberChecker {

    public static boolean hasTeen(int p1, int p2, int p3){
         return isTeen(p1) || isTeen(p2) || isTeen(p3) ;

    }

    public static boolean isTeen(int p1){
        return p1>=13 && p1<=19;
    }
}
