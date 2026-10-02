class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int m = image[0].length;   
        for(int i=0;i<n;i++){
            reverseAndInvert(image[i],m);
        }
        return image;
    }

    static void reverseAndInvert(int[] row,int length){
        int i=0;
        int j=length-1;
        while(i<=j){
            if(row[i] == row[j]){
                 int temp = 1-  row[i];
                row[i] = temp;
                row[j] = temp;
            }
           
            i++;
            j--;
        }
    }
}