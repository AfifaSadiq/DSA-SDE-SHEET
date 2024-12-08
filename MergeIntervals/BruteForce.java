class Solution {
    public int[][] merge(int[][] arr) {
        int len = arr.length;
        Arrays.sort(arr, (a,b) -> Integer.compare(a[0], b[0]));

        List<int[]> ans = new ArrayList<>();
        for(int i = 0; i < len; i++) {
            int start = arr[i][0];
            int end = arr[i][1];
            
            //if that inerval is already included in the solution then skipped
            if(!ans.isEmpty() && end <= ans.get(ans.size()-1)[1]) continue;

            for(int j=i+1; j<len; j++) {
                if(arr[j][0] <= end) {
                    end = Math.max(end, arr[j][1]);
                }
                else {
                    break;
                }
            }

            ans.add(new int[]{start, end});
        }

        return ans.toArray(new int[ans.size()][]);
    }
}
