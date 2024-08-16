package b06;

import java.util.Arrays;

public class Bai_4 {

    public static void main(String[] args) {
        // Cho ví dụ sẵn
        int n = 7; // Số lượng phần tử của mảng
        int k = 4; // Số lượng phần tử yêu cầu phải nhỏ hơn hoặc bằng x
        int[] array = {7, 2, 9, 4, 4, 5, 6}; // Mảng đã cho

        // Gọi hàm để tìm x
        int result = findSmallestX(array, n, k);

        // In ra kết quả
        System.out.println(result);
    }

    // Hàm tìm số nguyên dương x nhỏ nhất sao cho có đúng k phần tử nhỏ hơn hoặc bằng x
    public static int findSmallestX(int[] array, int n, int k) {
        // Sắp xếp mảng theo thứ tự tăng dần
        Arrays.sort(array);

        // Nếu k = 0, kiểm tra nếu tất cả các phần tử lớn hơn 1, trả về 1
        if (k == 0) {
            if (array[0] > 1) {
                return 1;
            } else {
                return -1;
            }
        }

        // Trường hợp nếu có k phần tử nhỏ hơn hoặc bằng x
        if (k <= n && (k == n || array[k - 1] != array[k])) {
            return array[k - 1];
        }

        // Nếu không tìm thấy x thỏa mãn, trả về -1
        return -1;
    }
}
