package video11;

import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagrams_49 {

  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> group = new HashMap<>();
    // O(n)
    for (String s : strs) {
      char[] chars = s.toCharArray();
      // O(s log(s))
      Arrays.sort(chars);
      var key = String.valueOf(chars);
      group.putIfAbsent(key, new ArrayList<>());
      group.get(key).add(s);
    }
    // Time Complexity: O(n * s log(s))
    return group.values().stream().collect(Collectors.toList());
  }

  public List<List<String>> groupAnagramsOptimize(String[] strs) {
    Map<String, List<String>> group = new HashMap<>();
    for (var s : strs) {
      int[] counter = new int[26];
      for (char c : s.toCharArray()) {
        counter[c - 'a']++;
      }
      var sb = new StringBuilder();
      for (int n : counter) {
        sb.append('#').append(n);
      }
      var key = sb.toString();
      group.putIfAbsent(key, new ArrayList<>());
      group.get(key).add(s);
    }
    // Time Complexity: O(n * s)
    return group.values().stream().collect(Collectors.toList());
  }
}
