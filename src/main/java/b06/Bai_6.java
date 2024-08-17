package b06;

public class Bai_6 {

    public static void main(String[] args) {
        // Cho sẵn giá trị đầu vào
        int A = 5; // Số mét leo được ban ngày
        int B = 2; // Số mét tụt xuống ban đêm
        int V = 10; // Chiều cao cột

        // Gọi hàm tính số ngày cần thiết
        int result = calculateDays(A, B, V);

        // In ra kết quả
        System.out.println(result);
    }

    // Hàm tính số ngày cần thiết để leo lên đỉnh cột
    public static int calculateDays(int A, int B, int V) {
        // Tính toán số ngày
        int days = (V - B) / (A - B);

        // Nếu còn dư quãng đường sau khi chia, cần thêm một ngày
        if ((V - B) % (A - B) != 0) {
            days++;
        }

        return days;
    }
}

