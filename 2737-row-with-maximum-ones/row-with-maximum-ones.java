class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int mx=0;
        int k=0;
        int rows = mat.length;
        int cols = mat[0].length;
        for(int i=0;i<rows;i++){
            int c=0;
            for(int j=0;j<cols;j++){
                c+=mat[i][j];
            }
            if(c>mx){
                mx=c;
                k=i;
            }
        }
        return new int[]{k,mx};
    }
}

