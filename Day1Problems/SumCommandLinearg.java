package Day1Problems;

public class SumCommandLinearg {
    /**
     * @param a
     */
    public static void main(String a[]) {
        int sum = 0;
        int invalid = 0;
        for (int x = 0; x < a.length; x++) {
        try {
        sum += Integer.parseInt(a[x]);
        } catch (NumberFormatException e) {
        invalid++;
        }
        }
        System.out.println(“Total no.of arguments: ”+a.length);
        System.out.println(“Invalid Integers: ”+invalid);
        System.out.println(“Sum: ”+sum);
        }
}
