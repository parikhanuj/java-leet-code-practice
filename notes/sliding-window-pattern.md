# Sliding Window Pattern

- problems dealing with an array or LL and calculate something among all the subarrays (or sublists) of given size

## Problems
- [Average of Subarrays](https://leetcode.com/problems/maximum-average-subarray-i/):
    - make a window with 2 pointers
    - iterate through the input array and move the window 
    - calculate avg for each window iteration and keep the max value
- [Minimum Size Subarray Sum](https://leetcode.com/problems/minimum-size-subarray-sum/description/):
    - this problem is basically asking to have min sub array whose sum is >= target
    - make a window with 2 pointers
    - iterate through whole array with window max size to be always >= target
    - start both the pointers from 0 index and keep adding number at pointer 2 till it is >= target
    - have a while loop which checks that the window sum is >= k
    - check for window length and update the result (min lenght) value, if needed and remove the num at pointer 1 (to get the min length) within while loop itself
- [Longest Substring with maximum K Distinct Characters](https://leetcode.com/problems/longest-substring-with-at-most-k-distinct-characters/description/):
    - make a window with 2 pointers
    - as we want distinct, maintain hashmap to identify what are the chars within the window and their number of occurrences
    - iterate through the input string on each character
    - within iteration have a while loop which would check if hashmap size is > k, it would decerese the counter for char at pointer 1 in hashmap, if it is zero, it would remove the key
    - within main loop, always check for max length for our result
- [Fruits into baskets](https://leetcode.com/problems/fruit-into-baskets/description/):
    - similar to above question, here the difference is that we have already given the target as 2 (buckets)
    - we have to find the max sub array, where we would have only 2 different values
- [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/description/)
    - make a window with 2 pointers
    - have a set to maintain the characters
    - loop through the string and take char at pointer 2
    - within parent loop, have another while loop which would check if that pointer 2 char is already present in the set
    - if it is present, start removing the char at pointer 1 until the set does not have pointer 2 char
    - add pointer 2 char to the set outside of loop
    - check for max size of the set
- [Longest Repeating Character Replacement](https://leetcode.com/problems/longest-repeating-character-replacement/description/):
    - make a window with 2 pointers
    - keep a map for having information of character occurences
    - keep a variable which would basically have value of Max occured character in the window
    - loop through all the character within string and keep adding char occurrence to the map
    - have a while which would check if the current window is outside of the replacement allowed
    - check for the max lenght of the window
- [Max Consecutive Ones III](https://leetcode.com/problems/max-consecutive-ones-iii/description/):
    - make window with 2 pointers
    - keep variable to have number of 1 counter in the window
    - loop through the array and keep incrementing the 1's counter
    - have a while loop which would check if the window outside of number of replacement allowed
    - check for the max lenght of each iteration
- [Permutation in String](https://leetcode.com/problems/permutation-in-string/description/)
    - 


