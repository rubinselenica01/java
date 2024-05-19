/*

Write a method hasEqualSum with 3 parameters of type int.

The method should return boolean and it needs to return true if the sum of the first and second parameter is equal to the third parameter. Otherwise, return false.

NOTE: The hasEqualSum method needs to be defined as public static ​like we have been doing so far in the course.
NOTE: Do not add a  main method to solution code.

 */

public class EqualSumChecker {

    public static boolean hasEqualSum(int p1, int p2, int p3){
        return (p1 + p2) == p3;
    }
}
