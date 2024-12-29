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