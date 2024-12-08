class Solution {
    public int[][] merge(int[][] arr) {
        int len = arr.length;
        Arrays.sort(arr, (a,b) -> Integer.compare(a[0], b[0]));

        List<int[]> ans = new ArrayList<>();
        int i = 0;
        for(i=0; i<len; i++) {            
            //if that inerval is already included in the solution then skipped
            if(ans.isEmpty() || arr[i][0] > ans.get(ans.size()-1)[1]) {
                //ans.add(Arrays.asList(arr[i][0], arr[i][0]));
                ans.add(new int[] { arr[i][0], arr[i][1] });
            }

            else {
                //ans.get(ans.size() - 1).set(1, Math.max(ans.get(ans.size()-1).get(1), arr[i][1]));
                ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], arr[i][1]);
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }
}
