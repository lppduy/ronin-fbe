package b06;
import java.util.Scanner;

public class Bai_7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Đọc số lượng giày màu đỏ và màu xanh
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // Gọi hàm tính số ngày Gấu có thể đeo giày
        int[] result = calculateDays(n, m);

        // In ra kết quả
        System.out.println(result[0] + " " + result[1]);
    }

    // Hàm tính số ngày Gấu có thể đeo giày
    public static int[] calculateDays(int n, int m) {
        // Số ngày đeo mỗi bên một màu
        int daysDifferentColors = Math.min(n, m);

        // Số ngày đeo 2 bên cùng màu sau đó
        int remainingShoes = Math.abs(n - m);
        int daysSameColors = remainingShoes / 2;

        return new int[]{daysDifferentColors, daysSameColors};
    }
}
