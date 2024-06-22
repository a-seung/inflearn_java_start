package loop.ex;

public class ForEx2 {
    public static void main(String[] args) {
        //초기식, 증감식을 여러개 사용할수도 있음
        for (int num = 2, count = 1; count <= 10; num+=2, count++) {
            System.out.println(num);
        }
    }
}
