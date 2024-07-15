package array;

public class Array1Ref3 {

    public static void main(String[] args) {
        int[] students; // 1. int형 배열을 담을 수 있는 변수 선언/자바는 배열생성하면 자동으로 초기값 생성해줌
        students = new int[]{90, 80, 70, 60, 50}; // 배열 생성하면서 초기 값을 설정해줄 수 있음

        // 변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수 : " + students[i]);
        }
    }
}
