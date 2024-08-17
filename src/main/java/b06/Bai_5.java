package b06;

public class Bai_5 {

    public static void main(String[] args) {
        // Cho sẵn giá trị đầu vào
        int N = 5; // Số lượng khách hàng
        int[] bills = {25, 25, 50, 50, 100}; // Mệnh giá tiền của các khách hàng

        // Kiểm tra xem có thể bán vé hay không
        System.out.println(canSellTickets(N, bills) ? "YES" : "NO");
    }

    // Hàm kiểm tra xem có thể bán vé hay không
    public static boolean canSellTickets(int N, int[] bills) {
        int count25 = 0, count50 = 0;

        for (int i = 0; i < N; i++) {
            if (bills[i] == 25) {
                count25++;
            } else if (bills[i] == 50) {
                if (count25 > 0) {
                    count25--;
                    count50++;
                } else {
                    return false;
                }
            } else if (bills[i] == 100) {
                if (count50 > 0 && count25 > 0) {
                    count50--;
                    count25--;
                } else if (count25 >= 3) {
                    count25 -= 3;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}
