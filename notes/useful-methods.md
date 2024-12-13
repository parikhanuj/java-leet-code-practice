# String
- toCharArray()
```
String s = "asdf";
s.toCharArray() // will return array of all the characters
```

# Arrays
- sort
```
int[] i = new int[]{4,2,1}
Arrays.sort(i) // will sort the original array
```

# HashMap
- getOrDefault
```
Map<String, Integer> counter = new HashMap<>();
counter.put("dummy", counter.getOrDefault("dummy", 0) + 1) // can be useful when working with counter map
```
- putIfAbsent
```
Map<String, List<Integer>> counter = new HashMap<>();
counter.putIfAbsent("dummy", new ArrayList()); // only puts the key if it is not present
```
