package loop;

public class Continue1 {

    public static void main(String[] args) {
        int i =1 ;

        while(i <= 5) {
            if (i == 3) {
                i++;
                continue;
                // i=3으로 조건식 만족하고 continue라서 출력 안하고 다시 while의 조건문으로 감
            }
            System.out.println(i);
            i++;
        }
    }
}
