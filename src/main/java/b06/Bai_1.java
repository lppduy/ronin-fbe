package b06;

import java.util.HashMap;
import java.util.Map;

public class Bai_1 {

    // Phương thức thực hiện cách 1: Sử dụng HashMap
    public void countWithHashMap(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : array) {
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                frequencyMap.put(num, 1);
            }
        }

        System.out.println("Kết quả theo cách 1 (sử dụng HashMap):");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Giá trị: " + entry.getKey() + ", Số lần xuất hiện: " + entry.getValue());
        }
    }

    // Phương thức thực hiện cách 2: Sử dụng mảng và vòng lặp lồng nhau
    public void countWithArray(int[] array) {
        boolean[] visited = new boolean[array.length];

        System.out.println("Kết quả theo cách 2 (sử dụng mảng và vòng lặp):");
        for (int i = 0; i < array.length; i++) {
            if (visited[i]) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println("Giá trị: " + array[i] + ", Số lần xuất hiện: " + count);
        }
    }

    public static void main(String[] args) {
        Bai_1 bai1 = new Bai_1();
        int[] array = {1, 2, 2, 3, 4, 4, 4, 5};

        // Thực hiện cách 1
        bai1.countWithHashMap(array);

        System.out.println();

        // Thực hiện cách 2
        bai1.countWithArray(array);
    }
}
