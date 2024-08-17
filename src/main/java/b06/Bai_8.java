package b06;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

public class Bai_8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Đọc 4 số nguyên đại diện cho màu của 4 chiếc bút
        int s1 = 2;
        int s2 = 3;
        int s3 = 2;
        int s4 = 4;

        // Cách 1: Sử dụng Set để đếm số màu khác nhau
        int result1 = calculateAdditionalPensUsingSet(s1, s2, s3, s4);
        System.out.println("Cách 1 (Sử dụng Set): " + result1);

        // Cách 2: Sử dụng mảng và sắp xếp
        int result2 = calculateAdditionalPensUsingArray(s1, s2, s3, s4);
        System.out.println("Cách 2 (Sử dụng mảng và sắp xếp): " + result2);
    }

    // Cách 1: Tính số lượng bút màu cần mua thêm bằng cách sử dụng Set
    public static int calculateAdditionalPensUsingSet(int s1, int s2, int s3, int s4) {
        Set<Integer> colors = new HashSet<>();

        // Thêm các màu vào tập hợp
        colors.add(s1);
        colors.add(s2);
        colors.add(s3);
        colors.add(s4);

        // Số màu còn thiếu là 4 trừ đi số màu hiện tại trong tập hợp
        return 4 - colors.size();
    }

    // Cách 2: Tính số lượng bút màu cần mua thêm bằng cách sử dụng mảng và sắp xếp
    public static int calculateAdditionalPensUsingArray(int s1, int s2, int s3, int s4) {
        // Đưa các màu vào một mảng
        int[] colors = {s1, s2, s3, s4};

        // Sắp xếp mảng để dễ dàng kiểm tra màu trùng lặp
        Arrays.sort(colors);

        // Đếm số màu khác nhau
        int uniqueColors = 1; // Khởi tạo với 1 vì có ít nhất 1 màu khác nhau
        for (int i = 1; i < 4; i++) {
            if (colors[i] != colors[i - 1]) {
                uniqueColors++;
            }
        }

        // Số bút cần mua thêm là 4 trừ đi số màu khác nhau
        return 4 - uniqueColors;
    }
}
