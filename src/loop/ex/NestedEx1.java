package loop.ex;

public class NestedEx1 {
    public static void main(String[] args) {
        for (int x = 1; x <= 9; x++) { //외부
            for (int y = 1; y <= 9; y++) { //내부
                System.out.println(x + " * " + y + " = " + x * y);
            }
            System.out.println();
        }
    }
}
