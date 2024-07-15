package array;

public class Array1Ref1 {

    public static void main(String[] args) {
        int[] students; // 1. int형 배열을 담을 수 있는 변수 선언/자바는 배열생성하면 자동으로 초기값 생성해줌
        students = new int[5]; // 2.// 총 5개의 int를 넣을 수 있게함
        System.out.println(students);

        // 변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        // 변수 값 사용
        System.out.println("학생1 점수 : " + students[0]);
        System.out.println("학생2 점수 : " + students[1]);
        System.out.println("학생3 점수 : " + students[2]);
        System.out.println("학생4 점수 : " + students[3]);
        System.out.println("학생5 점수 : " + students[4]);
    }
}
