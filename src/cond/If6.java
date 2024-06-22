package cond;

public class If6 {
    public static void main(String[] args) {
        //독립된 if문 2개라서 2개 조건 true면 모두 적용됨
        // else if 사용하면 조건 중 1개만 실행됨

        int price = 10000; //
        int age = 10;
        int discount = 0;

        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        } else if (age <= 10) {
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        } else {
            System.out.println("할인 없음");
        }

        System.out.println("총 할인 금액 : " + discount + "원");

        if(false)
            System.out.println("if문에서 실행됨");
            System.out.println("if문에서 실행안됨");
         // 중괄호 없이 쓸 수도 있는데 라인 1개만 적용됨 여러 라인을 적용하려면 중괄호로 묶어야함
         // 밑에 라인은 if문 밖임 if문과 무관함
        // 중괄호를 써야 가독성이 올라감
    }
}
