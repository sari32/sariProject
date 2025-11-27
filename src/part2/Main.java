package part2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<List<Integer>> findMaxIncreasingSubarrays(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        int n = arr.length;

        int i = 0;
        while (i < n) {
            List<Integer> current = new ArrayList<>();
            current.add(arr[i]);

            int j = i + 1;
            while (j < n && arr[j] > arr[j - 1]) {
                current.add(arr[j]);
                j++;
            }

            if (current.size() >= 2) {// שמור רק רצפים של 2 ומעלה
                result.add(current);
            }

            i = j; // דילוג ישר אחרי סוף הרצף
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2};
        List<List<Integer>> increasingSubarrays = findMaxIncreasingSubarrays(arr);

        for (List<Integer> subarray : increasingSubarrays) {
            System.out.println(subarray);
        }
    }
}
