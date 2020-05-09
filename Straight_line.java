class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int length=coordinates.length-1;
        double check_slope=0;
        double slope=(double)(coordinates[1][1]-coordinates[0][1])/(double)(coordinates[1][0]-coordinates[0][0]);
        for(int i=1;i<length;i++){
           check_slope=(double)(coordinates[i+1][1]-coordinates[i][1])/(double)(coordinates[i+1][0]-coordinates[i][0]);
            if(slope!=check_slope){return false;}
        }
        return true;
    }
}