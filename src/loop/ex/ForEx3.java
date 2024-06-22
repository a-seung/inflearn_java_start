package loop.ex;

public class ForEx3 {
    public static void main(String[] args) {
        int max = 100;
        int sum = 0;

        for (int i = 1; i <= max; i++) {
            sum += i; //sum = sum + i;
        }
        System.out.println(sum);
        //한번만 출력해 줄거니까 for문 밖에 써줘야함
    }
}
