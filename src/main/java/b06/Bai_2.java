package b06;

public class Bai_2 {

    public static void main(String[] args) {
        // Số lượng phần tử của mảng
        int n = 6;

        // Các phần tử của mảng
        int[] A = {9, 7, 12, 8, 6, 5};
        printArray(A);

        // Sắp xếp mảng theo thứ tự tăng dần
        sortArray(A);

        // In kết quả theo yêu cầu
        printArray(A);
    }

    // Hàm sắp xếp mảng theo thứ tự tăng dần
    // Bubble sort
    public static void sortArray(int[] A) {
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < n - i; j++) { // Điều chỉnh phạm vi của j để tối ưu
                if (A[j - 1] > A[j]) {
                    // Hoán đổi A[j-1] và A[j]
                    int temp = A[j - 1];
                    A[j - 1] = A[j];
                    A[j] = temp;
                }
            }
        }
    }

    // Hàm in kết quả theo khuôn dạng lớn nhất, nhỏ nhất, lớn thứ hai, nhỏ thứ 2, ...
    public static void printArray(int[] A) {
        int n = A.length;
        int left = 0, right = n - 1;
        boolean turn = true;

        while (left <= right) {
            if (turn) {
                System.out.print(A[right--]);
            } else {
                System.out.print(A[left++]);
            }

            if (left <= right) {
                System.out.print(", ");
            }
        }
        System.out.println("\n");
    }
}
