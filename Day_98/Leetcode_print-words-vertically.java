class Solution {
    public List<String> printVertically(String s) {
        String strArr[] = s.split(" ");
        int maxLengthWOrd=0;
        for(String w : strArr){
            maxLengthWOrd=Math.max(maxLengthWOrd,w.length());
        }
        char[][] chArr=new char[strArr.length][maxLengthWOrd];
        for(char[] row : chArr){
            Arrays.fill(row,' ');
        }
        int row=0;
        int col=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!=' '){
                chArr[row][col]=s.charAt(i);
                col++;
            }else{
                row++;
                col=0;
            }
        }
        List<String> ans=new ArrayList<>();
        for(int j=0; j<chArr[0].length; j++){
            String st="";
            for(int i=0; i<chArr.length; i++){
               st+=chArr[i][j]+"";
            }
            ans.add(st.stripTrailing());
        }
        return ans;
    }
}
