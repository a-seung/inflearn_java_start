package loop;

public class While1_2 {
    public static void main(String[] args) {
        int count = 0;

        //조건이 true면 코드블록을 계속 돌음
        while (count < 3) {
            count = count + 1; //count++
            System.out.println("현재 숫자는 : " + count);
        }
    }
}
