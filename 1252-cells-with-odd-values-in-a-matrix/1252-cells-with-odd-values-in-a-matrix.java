class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        
        for(int i=0;i<indices.length;i++){
            int targetRow = indices[i][0];
            int targetCol = indices[i][1];

            for(int col=0;col<n;col++){
                matrix[targetRow][col] += 1;
            }

             for(int row=0;row<m;row++){
                matrix[row][targetCol] += 1;
            }
        }



        int countOdd = 0;
        for(int[] row:matrix){
            for(int element:row){
                if(element % 2 != 0){
                    countOdd++;
                }
            }
        }
        return countOdd;
    }
}