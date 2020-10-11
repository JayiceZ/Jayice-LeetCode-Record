class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix==null||matrix.length==0){
            return 0;
        }
        int max='0';
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                char pre=(i==0||j==0)?'0':matrix[i-1][j-1];
                char left=j==0?'0':matrix[i][j-1];
                char top=i==0?'0':matrix[i-1][j];
                if(matrix[i][j]=='1'){
                    matrix[i][j]=(char)(Math.min(pre,Math.min(left,top))+1);
                    max=Math.max(max,matrix[i][j]);
                }
            }
        }
        return (max-'0')*(max-'0');
    }
}