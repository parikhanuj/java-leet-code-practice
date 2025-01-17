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
```java
String str = "Hello, World!";
char[] charArray = str.toCharArray();
```

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
- computeIfAbsent
```
Map<String, List<Integer>> counter = new HashMap<>();
counter.computeIfAbsent("dummy", val -> new ArrayList()).add(1); // only puts the key if it is not present
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
- keySet
```
HashMap<Integer, String> hm = new HashMap<>();
hm.put(20, "Geeks");
hm.put(15, "for");
for (Integer key : hm.keySet()) {
    System.out.println("Key: " + key);
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
- floorEntry - Returns a key-value mapping associated with the greatest key less than or equal to the given key, or null if there is no such key.
```java
Map.Entry<Integer, String> entry = timestamps.floorEntry(timestamp);
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
- priority queue as max heap for simple integers
```java
PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
```

# Stack
- push(e)
- peek() (retrieves the value at top of stack, but does not remove it)
- pop() (retrieves and remove value at top of stack)

- Stack<Integer> s = new Stack<>();
p.add(1);
p.peek(); // 1
p.pop(); // 1
```

# LinkedList Node
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

# Deque
- addFirst(E e): Adds an element to the head of the deque.
- addLast(E e): Adds an element to the tail of the deque.
- offerFirst(E e): Inserts an element at the head if possible, returning true if successful, false otherwise.
- offerLast(E e): Inserts an element at the tail if possible, returning true if successful, false otherwise.
- push(E e): Adds an element to the head of the deque (stack behavior).
- removeFirst(): Removes and returns the first element from the deque. Throws an exception if the deque is empty.
- removeLast(): Removes and returns the last element from the deque. Throws an exception if the deque is empty.
- pollFirst(): Retrieves and removes the first element, returning null if the deque is empty.
- pollLast(): Retrieves and removes the last element, returning null if the deque is empty.
- pop(): Removes and returns the first element (stack behavior). Throws an exception if the deque is empty.****
```java
// Create a Deque of Strings
Deque<String> d = new ArrayDeque<>();

d.addFirst("1");
d.addLast("2");

String f = d.removeFirst();
String l = d.removeLast();

// Displaying the Deque
System.out.println("First: " + f + ", Last: " + l);
```