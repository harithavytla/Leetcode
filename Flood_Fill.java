class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color=image[sr][sc];
        if(color!=newColor){
            fillColor(image,sr,sc,color,newColor);
        }
        return image;
    }
    public void fillColor(int[][] image,int sr,int sc,int color,int newColor){
        if(image[sr][sc]==color){
            image[sr][sc]=newColor;
            if(sr>0){fillColor(image,sr-1,sc,color,newColor);}
            if(sc>0){fillColor(image,sr,sc-1,color,newColor);}
            if(sr+1<image.length){fillColor(image,sr+1,sc,color,newColor);}
            if(sc+1<image[0].length){fillColor(image,sr,sc+1,color,newColor);}
        }
    }
}