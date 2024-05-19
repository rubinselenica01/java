public class Challenge1 {

    public static void main(String[] args) {
        double totalCentimeters = convertToCentimeters(7,20);
        System.out.println("Total of centimeters is " + totalCentimeters);
    }

    //1 foot = 12 inches
    //1 inch = 2.54 cm;
    public static double convertToCentimeters(int heightInInches){
        return heightInInches * 2.54d;
    }

    public static double convertToCentimeters(int heightInFeet, int remainingHeightInInches){
            int feetToInches = heightInFeet * 12;
            int totalInches = feetToInches + remainingHeightInInches;
            return convertToCentimeters(totalInches);
    }

}
