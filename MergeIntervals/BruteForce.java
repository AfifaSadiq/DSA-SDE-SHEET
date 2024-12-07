import java.util.*;

class Solution {
    public int[][] merge(int[][] arr) {
        int n = arr.length; // size of the array
        // Sort the given intervals:
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) { // Select an interval:
            int start = arr[i][0];
            int end = arr[i][1];

            // Skip all the merged intervals:
            if (!ans.isEmpty() && end <= ans.get(ans.size() - 1)[1]) {
                continue;
            }

            // Check the rest of the intervals:
            for (int j = i + 1; j < n; j++) {
                if (arr[j][0] <= end) {
                    end = Math.max(end, arr[j][1]);
                } else {
                    break;
                }
            }
            ans.add(new int[]{start, end});
        }

        // Convert the List<int[]> to int[][]:
        return ans.toArray(new int[ans.size()][]);
    }
}
