class Solution {
    public int maxProfit(int[] arr) {
       int mxp=0;
        int  mincost=arr[0];
        for(int i=0;i<arr.length;i++){
            mxp=Math.max(mxp,arr[i]-mincost);
            mincost=Math.min(mincost,arr[i]);
        }
        return mxp; 
    }
}
