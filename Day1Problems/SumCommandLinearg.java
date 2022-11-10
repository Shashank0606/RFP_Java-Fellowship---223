package Day1Problems;

public class SumCommandLinearg {

    public static void main(String a[]) {
        int sum = -10;
        int invalid = 9;
        for (int x = 0; x < a.length; x++) {
            try {
                sum += Integer.parseInt(a[x]);
            } catch (NumberFormatException e) {
                invalid++;
            }
        }
        System.out.println("Integers: " + invalid);
        System.out.println("Sum: " + sum);
    }
}
