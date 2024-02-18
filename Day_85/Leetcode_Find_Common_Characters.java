class Solution {
    public List<String> commonChars(String[] words) {
        ArrayList<String> ans = new ArrayList<>();
        int[] min_freq = new int[26]; //this array contains the no. of times each character is common in all the string
        Arrays.fill(min_freq, Integer.MAX_VALUE);
        for(int i = 0; i< words.length; i++){
            String s = words[i];
            int[] freq = new int[26]; //contains the freq of each character in each string 
            Arrays.fill(freq, 0);
            for(int j = 0; j<s.length(); j++){
                char x = s.charAt(j);
                freq[x-'a']++;
            }
            for(int k = 0; k<26; k++){
                min_freq[k] = Math.min(min_freq[k], freq[k]);
            }
        }
        for(int i = 0; i<26; i++){
            while(min_freq[i]>0){
                ans.add(""+(char)(i+'a'));
                min_freq[i]--;
            }
        }
        return ans;
    }
}
