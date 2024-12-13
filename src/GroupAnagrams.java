class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramsGroupMap = new HashMap<>();
        for (String str: strs) {
            int[] count = new int[26];
            for (int i = 0; i < str.length(); i++) {
                count[str.charAt(i) - 'a']++;
            }
            String countArrStr = Arrays.toString(count);
            anagramsGroupMap.putIfAbsent(countArrStr, new ArrayList());
            anagramsGroupMap.get(countArrStr).add(str);
        }
        return new ArrayList<>(anagramsGroupMap.values());
    }
}