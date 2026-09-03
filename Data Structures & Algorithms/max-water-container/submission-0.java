class Solution {
    public int maxArea(int[] heights) {
        int left=0,right=heights.length-1,maxArea=0;

        while(left<right){
            int wide=right-left;
            int minHeight=Math.min(heights[left],heights[right]);
            int area=wide*minHeight;
            maxArea=Math.max(maxArea,area);

            if(heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }
        }

        return maxArea;
    }
}
