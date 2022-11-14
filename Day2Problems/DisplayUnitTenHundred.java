package Day2Problems;

public class DisplayUnitTenHundred {

    public class SingleDigitNumber {
        public static void main(String[] args) {
            int x = Integer.parseInt(args[0]);
            if (x == 1)
                System.out.println("One");
            else if (x == 10)
                System.out.println("Ten");
            else if (x == 100)
                System.out.println("Hundred");
            else if (x == 1000)
                System.out.println("Thousand");
            else
                System.out.println("Enter number 1 , 10, 100, 1000");
        }

    }

}
