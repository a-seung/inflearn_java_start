package array;

public class Array1Ref2 {

    public static void main(String[] args) {
        int[] students; // 1. int형 배열을 담을 수 있는 변수 선언/자바는 배열생성하면 자동으로 초기값 생성해줌
        students = new int[5]; // 2.// 총 5개의 int를 넣을 수 있게함
        System.out.println(students.length);

        // 변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        // 변수 값 사용
        for(int i = 0 ; i < students.length; i++){
            System.out.println("학생" + (i+1) + " 점수 : "+students[i]);
        }
    }
}
