# List class
- Create a list: `List<String> list = new ArrayList<>();`
- Add element: `list.add("Apple");`
- Add element at specific index: `list.add(1, "Banana");`
- Add all elements from another list: `list.addAll(anotherList);`
- Get element by index: `list.get(index);`
- Set (replace) element at index: `list.set(index, "Orange");`
- Remove element by value: `list.remove("Apple");`
- Remove element by index: `list.remove(index);`
- Remove all elements present in another list: `list.removeAll(anotherList);`
- Retain only common elements with another list: `list.retainAll(anotherList);`
- Check if list contains element: `list.contains("Apple");`
- Get size of list: `list.size();`
- Check if list is empty: `list.isEmpty();`
- Clear all elements: `list.clear();`
- Get index of element: `list.indexOf("Apple");`
- Get last index of element: `list.lastIndexOf("Apple");`
- Convert list to array: `list.toArray();`
- Iterate over list using loop:  
  ```java
  for (String item : list) {
      System.out.println(item);
  }
  ```
- Iterate using `forEach`:  
  ```java
  list.forEach(System.out::println);
  ```
- Sort list: `Collections.sort(list);`
- Reverse list: `Collections.reverse(list);`
- Shuffle list: `Collections.shuffle(list);`
- Get sublist: `list.subList(startIndex, endIndex);`
- Convert list to stream: `list.stream();`
- Convert array to list: `Arrays.asList(array);`
- Create immutable list: `List.of("A", "B", "C");`
- Compare two lists: `list1.equals(list2);`
- Copy one list into another: `Collections.copy(destList, srcList);`
