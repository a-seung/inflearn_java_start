package cond.ex;

public class MovieRateEx {
    public static void main(String[] args) {
        double rating = 7.1;

        //여러 조건을 만족해야해서 if문을 묶으면 안됌
        if (rating <= 9) {
            System.out.println("'어바웃타임'을 추천합니다.");
        }
        if (rating <= 8) {
            System.out.println("'토이 스토리'를 추천합니다.");
        }
        if (rating <= 7) {
            System.out.println("'고질라'를 추천합니다.");
        }
    }
}
