package ch4;

public class ForEx8 {
    public static void main(String[] args) {
        // 4x + 5y = 60 을 만족하는 x,y 값 출력
        // x,y는 10이하의 자연수

        // 4 * 1 + 5 * (1~10) = 60
        // 4 * 2 + 5 * (1~10) = 60
        // 출력 예시 (4,5)
        for (int x = 1; x < 11; x++) {
            for (int y = 1; y < 11; y++) {
                if (4 * x + 5 * y == 60) {
                    System.out.printf("(%d, %d)\n", x, y);
                }
            }
        }
    }
}
