# General
- to divide a number with another number and get the ceil value
  - like 7/2, we should get as 4 instead of 3
  - we can do like `(numerator + denominator - 1)/2` like `(7 + 2 - 1)/2 = 4` 

# Integer
- toString()
- Integer.MAX_VALUE
- Integer.MIN_VALUE
- Integer.parseInt(<str>)

# String
- toCharArray()
```
String s = "asdf";
s.toCharArray() // will return array of all the characters
```
- toLowerCase()
```
String s = "asdf";
s.toLowerCase() // will return array of all the characters
```

# Characters
- isLetterOrDigit()
```
String s = "asdf"
Character.isLetterOrDigit(s.charAt(0)); // returns boolean value
```
- custom function to identify if the character is alphanumeric
```java
public boolean alphaNum(char c) {
    return (c >= 'A' && c <= 'Z' || 
            c >= 'a' && c <= 'z' || 
            c >= '0' && c <= '9');
}
```

# Arrays
- sort
```
int[] i = new int[]{4,2,1}
Arrays.sort(i) // will sort the original array
```
- creating array from provided range
```
int start = 1;
int end = 13;
int[] rangeArray = IntStream.rangeClosed(start, end).toArray();
```
- converting int[] to List<Integer>
```java
int[] a = new int[]{1,2,3}
List<Integer> aList = Arrays.stream(a).boxed().collect(Collectors.toList());
```
- to find mid for binary search
```java
int mid = left + (right - left) / 2;
```
- within 2D matrix, to calculate row and column
```java
int ROWS = matrix.length, COLS = matrix[0].length;

int l = 0, r = ROWS * COLS - 1;
while (l <= r) {
    int m = l + (r - l) / 2;
    int row = m / COLS, col = m % COLS;
}
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
- entrySet
```
HashMap<Integer, String> hm = new HashMap<>();
hm.put(20, "Geeks");
hm.put(15, "for");
for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
    System.out.println("Value: " + entry.getValue());
    System.out.println("Key: " + entry.getKey());
}
```
- putting Map in DS like PriorityQueue or Stack
```java
PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
```

# TreeMap
- The map is sorted according to the natural ordering of its keys, or by a Comparator provided at map creation time, depending on which constructor is used
- This proves to be an efficient way of sorting and storing the key-value pairs
- [Example usage](https://www.geeksforgeeks.org/treemap-in-java/#)
- [Methods](https://docs.oracle.com/javase/8/docs/api/java/util/TreeMap.html)
```java
Map<String, Integer> treeMap = new TreeMap<>();

// Adding elements to the tree map
treeMap.put("A", 1); // O(log n)
treeMap.put("C", 3); // O(log n)
treeMap.put("B", 2); // O(log n)
```

# PriorityQueue - Max/Min Heap
- add(e)
- peek() (retrieves the value at head, but does not remove it)
- poll() (retrieves and remove value at the head)
```
PriorityQueue<Integer> p = new PriorityQueue<>();
p.add(1);
p.peek(); // 1
p.poll(); // 1
```
- priority queue as max heap
```java
PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
```

# Stack
- push(e)
- peek() (retrieves the value at top of stack, but does not remove it)
- pop() (retrieves and remove value at top of stack)
```
Stack<Integer> s = new Stack<>();
p.add(1);
p.peek(); // 1
p.pop(); // 1
```

#LinkedList Node
- reverse LL
```java
public ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode curr = head; 
    while (curr != null) {
        ListNode temp = curr.next;
        curr.next = prev;
        prev = curr;
        curr = temp;
    }
    return prev;
}
```
- mid node of LL
```java
ListNode slow = head;
ListNode fast = head.next;

// find mid of the linkedlist
while (fast != null && fast.next != null) {
    slow = slow.next;
    fast = fast.next.next;
}
```
