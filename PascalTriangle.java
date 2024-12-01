class Solution {
    public List<List<Integer>> generate(int rows) {
        List<List<Integer>> temp = new ArrayList<>();
        for(int row = 1; row<=rows; row++) {
            temp.add(generateRow(row));
        }
        /**for(int row = 1; row<=rows; row++){
            List<Integer> arr = new ArrayList<>();
            for(int col = 1; col<=row; col++){
                arr.add(nCr(row-1, col-1));
            }
            temp.add(arr);
        }**/
        return temp;
    }
    public List<Integer> generateRow(int row) {
        long num = 1;
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        for(int col=1; col<row; col++) {
            num = num * (row - col);
            num = num / col;
            arr.add((int)num);
        }
        return arr;
    }
    /**public int nCr (int n, int r) {
        long num = 1;
        for(int i=0; i<r; i++) {
            num = num * (n - i);
            num = num / (i+1);
        }
        return (int)num;
    }**/
}
