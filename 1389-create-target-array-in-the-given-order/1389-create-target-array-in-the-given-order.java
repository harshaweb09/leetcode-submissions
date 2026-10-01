class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
       int n = nums.length;
        int[] target = new int[n];
        for(int i=0;i<n;i++){
            moveRight(target,i,index[i]);
            target[index[i]] = nums[i];
        }
        return target;
    }

    static void moveRight(int[] ans,int i,int index){
        for(int j=i;j>index;j--){
            ans[j] = ans[j-1];
        }
    }
}