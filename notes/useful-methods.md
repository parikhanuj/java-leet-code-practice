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

# Characters
- isLetterOrDigit()
```
String s = "asdf"
Character.isLetterOrDigit(s.charAt(0)); // returns boolean value
```

# PriorityQueue
- add(e)
- peek() (retrieves the value at head, but does not remove it)
- poll() (retrieves and remove value at the head)
```
PriorityQueue<Integer> p = new PriorityQueue<>();
p.add(1);
p.peek(); // 1
p.poll(); // 1
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
