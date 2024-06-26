package casting;

public class Casting1 {
    // 작은 범위를 큰범위에 넣는 것은 허용됨
    public static void main(String[] args) {

        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; // int -> long
        System.out.println("longValue = " + longValue);

        doubleValue = intValue; // int -> double
        System.out.println("doubleValue = " + doubleValue); //double 형이라 소수점 표현됨

        doubleValue = 20L; //long -> double
        System.out.println("doubleValue2 = " + doubleValue);

        //작은 범위에서 큰 범위로의 형변환은 자동으로 자바에서 해줌 -> 자동형변환
    }
}
