package operator;

public class Operator1 {
    public static void main(String[] args) {
        // 변수 초기화
        int a = 5;
        int b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum); //출력 a + b = 7

        // 뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff); // 출력 a - b = 3

        // 곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi);

        //나눗셈
        int div = a / b; // int끼리 계산 했기 때문에 소숫점 뒤는 날라간것=>형변환이 필요함
        System.out.println("a / b = " + div);
        // 예외=> 0으로 나누는 것은 수학에서 허용하지 않음=> 오류 뜸

        // 나머지
        int mod = a % b;
        System.out.println("a % b = " + mod);
    }

}
