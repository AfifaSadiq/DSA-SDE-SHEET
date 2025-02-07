public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        int n = A.length; 
        int[] hash = new int[n + 1]; 

        for (int i = 0; i < n; i++) {
            hash[A[i]]++;
        }

        int rep = -1, miss= -1;
        for (int i = 1; i <= n; i++) {
            if (hash[i] == 2) rep= i;
            else if (hash[i] == 0) miss= i;

            if (rep!= -1 && miss!= -1)
                break;
        }
        int[] ans = {rep, miss};
        return ans;
    }
}
