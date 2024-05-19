/*
DecimalComparator
Write a method areEqualByThreeDecimalPlaces with two parameters of type double.

The method should return boolean, and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.

TIP: Use paper and pencil.

TIP: Use casting.

NOTE: The areEqualByThreeDecimalPlaces method  needs to be defined as public static ​like we have been doing so far in the course.
NOTE: Do not add a  main method to solution code.
 */

public class DecimalComparator {
    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(3.176,3.3);
    }
    public static boolean areEqualByThreeDecimalPlaces(double p1, double p2){
        if(!(Math.round(p1) == Math.round(p2))){
            return false;
        }
        int p1Int = ((int)(p1 * 1000))%1000;
        int p2Int = ((int)(p2 * 1000))%1000;

        if (p1Int == p2Int)
            return true;
        return false;
    }

}
