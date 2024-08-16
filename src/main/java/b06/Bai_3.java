package b06;

public class Bai_3 {

    public static void main(String[] args) {
        // Hai mảng đã sắp xếp
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8, 10};

        // Gọi hàm mergeArrays để trộn hai mảng
        int[] mergedArray = mergeArrays(array1, array2);

        // In ra mảng đã trộn và sắp xếp
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i]);
            if (i < mergedArray.length - 1) {
                System.out.print(", ");
            }
        }
    }

    // Hàm trộn hai mảng đã sắp xếp thành một mảng cũng được sắp xếp
    public static int[] mergeArrays(int[] array1, int[] array2) {
        int n1 = array1.length;
        int n2 = array2.length;
        int[] mergedArray = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        // Trộn hai mảng bằng cách so sánh từng phần tử
        while (i < n1 && j < n2) {
            if (array1[i] <= array2[j]) {
                mergedArray[k++] = array1[i++];
            } else {
                mergedArray[k++] = array2[j++];
            }
        }

        // Sao chép các phần tử còn lại của array1 (nếu có)
        while (i < n1) {
            mergedArray[k++] = array1[i++];
        }

        // Sao chép các phần tử còn lại của array2 (nếu có)
        while (j < n2) {
            mergedArray[k++] = array2[j++];
        }

        return mergedArray;
    }
}
