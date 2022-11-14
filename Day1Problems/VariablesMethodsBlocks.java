package Day1Problems;

// static variables methods and blocks
class variablesMethodsBlocks {
    static int var1; // variable
    static String var2; // variable
    // This is a Static Method

    static void disp() {
        // Blocks
        System.out.println("Var1 is: " + var1);
        System.out.println("Var2 is: " + var2);
    }

    public static void main(String args[]) {
        disp();
    }
}