# Queue class

- **Add element:** `queue.add(element);`
  - Adds the specified element to the queue if space allows.

- **Add element:** `queue.offer(element);`
  - Inserts the specified element into the queue. Throws an IllegalStateException if the queue is full (though LinkedList typically doesn't have a fixed capacity).

- **Remove element:** `queue.remove();`
  - Retrieves and removes the head of the queue. Throws a NoSuchElementException if the queue is empty.

- **Remove element:** `queue.poll();`
  - Retrieves and removes the head of the queue. Returns null if the queue is empty. This is generally preferred over remove() when handling potentially empty queues.

- **Peek at the head:** `queue.peek();`
  - Retrieves the head of the queue without removing it.

- **Check if empty:** `queue.isEmpty();`
  - Checks if the queue is empty.

- **Queue size:** `queue.size();`
  - Returns the number of elements in the queue.

- **Clear the queue:** `queue.clear();`
  - Removes all elements from the queue.

- **Contains element:** `queue.contains(element);`
  - Checks if the queue contains a specific element.

- **Convert to array:** `queue.toArray();`
  - Returns an array containing all elements of the queue.

- **Iterate over elements:** `queue.iterator();`
  - Returns an iterator over the elements in the queue.
