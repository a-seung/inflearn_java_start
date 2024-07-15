package array;

public class Array1Ref4 {

    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};
        // 1. int형 배열을 담을 수 있는 변수 선언
        // 배열 생성하면서 초기 값을 설정해줄 수 있음
        // 배열 선언과 합쳐서 쓸 수 있고 합쳐서 썼을 때만 new int[] 생략가능

        // 변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수 : " + students[i]);
        }
    }
}
