import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k){
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();   //rSum and count
        int rSum=0;
        int result = 0;

        map.put(0,1);
        

        for(int num:nums)
        {
            rSum += num;
            int cmp = rSum - k;
            if(map.containsKey(cmp))
            {
                result += map.get(cmp);
            }

            map.put(rSum,map.getOrDefault(rSum,0)+1);

        }

return result;


        
   
    }}