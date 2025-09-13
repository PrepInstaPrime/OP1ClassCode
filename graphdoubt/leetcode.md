# Question 1: 
## https://leetcode.com/problems/find-the-town-judge/description/
 ```
 class Solution {
    public int findJudge(int n, int[][] trust) {
        int inDegree[]= new int[n+1];
        int outDegree[]= new int[n+1];
        if(n==1){
            return 1;
        }
        for(int nums[]:trust){
            inDegree[nums[1]]++;
            outDegree[nums[0]]++;
        }
        for(int i=0;i<=n;i++){
            if(inDegree[i]==n-1&&outDegree[i]==0){
                return i;
            }
        }
        return -1;
    }
}
 ```