package array;

public class ArrayDi3 {

    public static void main(String[] args) {
        // 2x3 2차원 배열 만들기
        int[][] arr = {  // new int[][]생략 가능
                {1, 2, 3},
                {4, 5, 6}
        }; // 행2, 열3

        for (int row = 0; row < arr.length; row++) { // 외부
            for (int column = 0; column < arr[row].length; column++) { // 내부
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();//한 행이 끝나면 라인을 변경한다.
        }
    }
}
