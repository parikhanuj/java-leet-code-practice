# Class Design

## Encode and Decode Strings
- [Neetcode Example](https://neetcode.io/problems/string-encode-and-decode)
- For encoding
  - First take each word and get the length of that word and keep the length with defined number of digits
    - like if "hello" is 5, the length calculated should be 005
    - `String.format("%03d", str.length())`
  - Next append "#" after that length and append the word
    - like "hello" would be `005#hello` 
  - Loop through all the strings within the input List<String> and use string builder
  - Output for input `[hello, world, test]` would be like `005#hello005#world004#test`
- For decoding
  - in the input string we would have length of each word before the word itself
    - like for `005#hello005#world004#test` first word would be 5 letters and it would be `hello`

## Min Stack
- [Neetcode Example](https://neetcode.io/problems/minimum-stack)
- Use 2 stacks, one to store actual values and one to store min values at that point of time
- `push()` - push actual number to first stack and minimum of `minStack.peek()` and `value` to top of minStack
- `pop()` - pop from both the stacks
- `top()` - peek from first stack
- `getMin()` - peek from minStack stack

## Queue (using 2 stacks)

## Time Based Key-Value Store
- [Neetcode Example](https://neetcode.io/problems/time-based-key-value-store)
- Create a store with Map DS like `private Map<String, TreeMap<Integer, String>> m`
- `set()` - just insert into the Map and instantiate new TreeMap if the key is new
- `get()` - normal retrieval from the map and use TreeMap's `floorEntry` function to get the nearest timestamp

## LRU cache implementation using LinkedList
- [Neetcode Example](https://neetcode.io/problems/lru-cache)
- Create a linkedlist double pointer class with next and prev pointers
- Keep head and tail as 2 seperate node
- Head side would always represent the node which are least recently used and can be removed if the size of the store increases the limit
- Tail side represents newly added node or recently used node
- Implementation
  - have a `Map<Integer, DoubleLL>` type map for storing the values
  - Always add a new node between head and tail, without replacing them
  - Have an `add(node)` function which adds that node to the tail side of the linkedlist
  - Have a `remove(node)` function which removes that node from linkedlist
  - `get(int key)`: fetch the node from cache store (hashmap). Remove that node from the linkedlist and add that same node back, so it would be at the tail of the list.
  - `put(int key, int value)`: check if the key is already present in the hashmap, if yes remove it. 
    - Create new node with the key and value and `add` it to the list
    - if capacity exceeds, remove from the head side
  
## Serialize and Deserialize Binary Tree
- [Neetcode Example](https://neetcode.io/problems/serialize-and-deserialize-binary-tree)
- `serialize(TreeNode root)` 
  - we would be using a StringBuilder to create a serialized string for binary tree
  - for the null nodes, we would be using "N" instead of skipping them, so that when recreating binary tree, we would know which node is actually null
  - do a level order traversal for the whole tree and keep "N" in the string for null nodes
  - after every node, we would have "," as delimeter
- `deserialized(String data)`
  - create a array of TreeNode split by ","
  - use a queue to do reverse level order traversal

## Median Finder for data stream
- [Neetcode Example](https://neetcode.io/problems/find-median-in-a-data-stream)
- we would be using 2 heaps. One min heap and one max heap
- we would also keep a size variable to determine how many values have been inputed
- `add(num)` 
  - add the number first to maxHeap and check if the size of maxHeap exceeds the mid size of input data
  - if thats the case, we would poll from maxHeap and offer it to minHeap
  - we would also have while loop to make sure that all the numbers are in correct heaps
- `findMedian`
  - if the size of both the heaps are same, we would peeks both the heaps and divide it by 2
  - otherwise the peek number in maxHeap is the median

## Circular Queue
- [Leetcode example](https://leetcode.com/problems/design-circular-queue/description/)
- idea is to have 2 pointers. Head and tail.
- also keep counter for current size within the queue
- have isFull and isEmpty function based on the current size
- change value for current size whenever enqueue or dequeue operation takes place
- whenever doing an operation, check if the pointer is out of size, if thats the case reset the pointer value
