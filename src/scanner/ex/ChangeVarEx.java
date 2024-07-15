package scanner.ex;

public class ChangeVarEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp; //a의 값 10을 잠시 보관하는 용도

        temp = a; //10
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println(temp);
    }
}
