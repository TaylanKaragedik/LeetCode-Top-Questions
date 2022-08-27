/*fun StringChallenge(str : String) : String =
    str.replace(Regex("(.) \\1*")){
    String.format("%d%s",it.value.length, it.groupValues[1])

}

fun main() {
    println(StringChallenge("aaaaabbbbbbbbbbcccccccddddd"))
}

 */


fun threeSum(nums: IntArray): List<List<Int>> {
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

fun main(){
    print(threeSum(intArrayOf(readLine()!!.toInt())))
}