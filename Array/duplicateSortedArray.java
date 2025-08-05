package Array;
import java.util.Arrays;
public class duplicateSortedArray {



        public static void main(String[] args) {
            int[] arr = {1, 2, 2, 3, 4, 4, 5};
            int n = arr.length;

            Arrays.sort(arr);

            int[] temp = new int[n];
            int j = 0;

            for (int i = 0; i < n - 1; i++) {
                if (arr[i] != arr[i + 1]) {
                    temp[j++] = arr[i];
                }
            }
            temp[j++] = arr[n - 1];

            int[] result = Arrays.copyOf(temp, j);

            for (int i = 0; i < j; i++) {
                System.out.print(result[i] + " ");
            }
        }
    

}
