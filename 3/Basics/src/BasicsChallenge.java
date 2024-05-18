public class BasicsChallenge {
    public static void main(String[] args) {
        double myFirstDoubleVar = 20.00d;
        double mySecondDoubleVar = 80.00d;

        double sumVar = (myFirstDoubleVar + mySecondDoubleVar) * 100.00d;
        System.out.println("sumVar = " + sumVar);
        double remainder = sumVar % 40.00d;
        System.out.println("remainder = " + remainder);

        boolean is0Point00 = (remainder == 0.00) ? true : false;
        System.out.println("is0Point00 = " + is0Point00);

        if (!is0Point00)
            System.out.println("Got some remainder");

    }
}
