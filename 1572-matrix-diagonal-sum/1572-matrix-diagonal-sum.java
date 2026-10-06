class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sub = 0;
        int i=0;
        int j=n-1;
        int sumP = 0;
        int sumS = 0;
        while(i<n){
            sumP += mat[i][i];
            sumS += mat[i][j];
            i++;
            j--;
        }
        if(n % 2 != 0){
            int index = n/2;
            sub = mat[index][index];
        }
        return (sumP + sumS - sub);
    };
}