class Solution {
    public int largestAltitude(int[] gain) {
        int altitudeFromZero = 0;
        int highestAltitude = 0;
        for(int i=0;i<gain.length;i++){
            altitudeFromZero += gain[i];
            if(altitudeFromZero > highestAltitude){
                highestAltitude = altitudeFromZero;
            }
        }
        return highestAltitude;
    }
}