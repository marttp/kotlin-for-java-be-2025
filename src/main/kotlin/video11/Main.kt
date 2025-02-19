package video11

fun main() {
    val strs = listOf("eat", "tea", "tan", "ate", "nat", "bat")
        .toTypedArray()
    val groupAnagram: GroupAnagrams_49 = GroupAnagrams_49()
    val result = groupAnagram.groupAnagramsOptimize(strs)
    println(result)
}