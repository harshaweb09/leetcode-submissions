class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int evenDigitCount = 0;
        for(int i=0;i<n;i++){
            if(hasEvenDigits(nums[i])){
                evenDigitCount++;
            }  
        }
        return evenDigitCount;
    }

    static boolean hasEvenDigits(int num){
        int digitCount = 0;
        while(num > 0){
            num /= 10;
            digitCount++;
        }
        if(digitCount % 2 ==0){
            return true;
        }
        else{
            return false;
        }
    }
}