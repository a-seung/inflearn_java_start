package loop;

public class Break1 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        //while반복문의 조건이 항상 true(참)이면 무한 반복됨=>break문을 써줘야함

        while(true) {
           sum = sum + i;
           //
           if (sum > 10) {
               System.out.println("합이 10 보다 크면 종료 : i = " + i + " sum = " + sum);
               break;
           }
           i++;

        }
    }
}
