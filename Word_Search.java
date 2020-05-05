class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
               if(search(board,i,j,0,word)){return true;}
            }
        }
        return false;
    }
    public boolean search(char[][]board, int i,int j,int pos,String word){
        if(word.charAt(pos)!=board[i][j]){return false;}
        if(pos==word.length()-1){return true;}
        char ch=board[i][j];
        board[i][j]='0';
        if(i-1>=0&&search(board,i-1,j,pos+1,word)||
          j-1>0=&&search(board,i,j-1,pos+1,word)||
          i+1<board.length&&search(board,i+1,j,pos+1,word)||
          j+1<board[0].length&&search(board,i,j+1,pos+1,word)){
            return true;
        }
        board[i][j]=ch;
        return false;
    }
}