class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] mark=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    if(search(board,word,0,mark,i,j))
                        return true;
                }
            }
        }
        return false;
    }

    private boolean search(char[][]board,String word,int index,boolean[][]mark,int i,int j){
        if(index==word.length())
            return true;
        if(i<0||i>board.length-1||j<0||j>board[0].length-1||mark[i][j])
            return false;
        if(board[i][j]==word.charAt(index)){
            mark[i][j]=true;
            if(search(board,word,index+1,mark,i-1,j))
                return true;
            if(search(board,word,index+1,mark,i+1,j))
                return true;
            if(search(board,word,index+1,mark,i,j-1))
                return true;
            if(search(board,word,index+1,mark,i,j+1))
                return true;
            mark[i][j]=false;
        }
        return false;
    }
}
