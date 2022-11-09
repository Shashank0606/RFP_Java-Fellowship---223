package Day1Problems;

public class SumCommandLinearg {
    private static final String Total = null;

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
        System.out.println(Total + " no.of arguments: ");
        System.out.println(invalid + "Integers: " + invalid);
        System.out.println(" Sum: " + sum);
    }
}
