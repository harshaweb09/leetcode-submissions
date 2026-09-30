class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        int n = candies.length;
        for(int i=1;i<n;i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }
        List<Boolean> greatest = new ArrayList<>();
        for(int i=0;i<n;i++){
            int countCandies = extraCandies + candies[i];
            if(countCandies >= max){
               greatest.add(true);
            }else{
               greatest.add(false);
            }
        }
        return greatest;
    }
}