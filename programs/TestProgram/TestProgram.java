package programs.TestProgram;

/**
 * TestProgram
 */
public class TestProgram {
    public static void main(String[] args) {
        int i = 2;
        while (i >= 0) {
            main(args);
            System.out.println("GFG");
            --i;
        }
    }
}