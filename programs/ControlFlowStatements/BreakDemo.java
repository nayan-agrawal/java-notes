package programs.ControlFlowStatements;

public class BreakDemo {
    public static void main(String args[]) {
        for (int i = 0; i < 5; i++) {
            // print numbers from 1 to 3 using loop to 5
            if (i == 3)
                break;

            System.out.print(i + " ");
        }
    }
}
