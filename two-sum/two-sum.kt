class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        
        val map = HashMap<Int, Int>()
        for(i in 0 until nums.size){
            val complement = target - nums[i]
            if(map.containsKey(complement)){
                map[complement]?.let{ index -> 
                    return intArrayOf(i, index )
                }
            }
            else{
                map.put(nums[i], i)
            }
        }
        
        return intArrayOf(-1, -1)

    }
}