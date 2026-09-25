class Solution {
    public int heightChecker(int[] heights) {
        int[] expected =heights.clone();
        int count=0;
        for(int i=0;i<expected.length-1;i++){
            for(int j=i+1; j<expected.length;j++){
                if(expected[i]>expected[j]){
                    int temp=expected[i];
                    expected[i]=expected[j];
                   expected[j]=temp;
                    
                }
            }
        }
        for (int i = 0; i < heights.length; i++) {
             if (heights[i] != expected[i]) {
                 count++;
     }
      }
       return count;
    }
}