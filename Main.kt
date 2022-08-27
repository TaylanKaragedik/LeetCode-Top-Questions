fun threeSum(nums: IntArray): List<List<Int>> {
    //You migth need configure your run configuration if try to run in intellij but 
    //it definetly work at leetcode
    
    var set = HashSet<List<Int>>()
    if(nums.size <= 2) {
        return set.toList()
    }

    nums.sort()
    for(i in 0 until nums.size - 2) {
        var low = i + 1
        var high = nums.size - 1
        while (low < high) {
            var sum = nums[i] + nums[low] + nums[high]
            when {
                sum == 0 -> {
                    set.add(listOf(nums[i], nums[low], nums[high]))
                    low++
                    high--
                }
                sum < 0 -> low++
                else -> high--
            }
        }
    }

    return set.toList()
}

