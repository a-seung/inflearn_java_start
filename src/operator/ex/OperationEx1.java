package operator.ex;

public class OperationEx1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        int sum = num1 + num2 + num3;
        int average = sum / 3;
        //int는 정수라서 int끼리 계산하면 소숫점 이하는 버리게 됨

        System.out.println("sum = " + sum);
        System.out.println("average = " + average);

    }
}
