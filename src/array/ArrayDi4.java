package array;

public class ArrayDi4 {

    public static void main(String[] args) {
        // 2x3 2차원 배열 만들기
        // new int[][]생략 가능
        int[][] arr = new int[4][5]; // 행2, 열3

        int i = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = i++;
            }
        } // 2차원 배열 돌면서 값을 넣고

        for (int row = 0; row < arr.length; row++) { // 외부
            for (int column = 0; column < arr[row].length; column++) { // 내부
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();//한 행이 끝나면 라인을 변경한다.
        } // 2차원 배열 돌면서 출력함
    }
}
