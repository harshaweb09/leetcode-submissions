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
            int temp = row[i];
            row[i] = 1 - row[j];
            row[j] = 1 - temp;
            i++;
            j--;
        }
    }
}