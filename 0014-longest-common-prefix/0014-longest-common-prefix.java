class Solution {
    public String longestCommonPrefix(String[] str) {
        StringBuffer sb = new StringBuffer();
        Arrays.sort(str);
        String first = str[0];
        String last = str[str.length-1];
        for(int i=0; i<Math.min(last.length(),first.length());i++){
            if(first.charAt(i)!=last.charAt(i)) return sb.toString();
            sb.append(first.charAt(i));
        }
        return sb.toString();
        
        // StringBuffer sb = new StringBuffer();
        // for (int i=0; i< str[0].length(); i++){
        //     for (int j=1; j< str.length; j++){
        //         if (i >= str[j].length() || str[0].charAt(i) != str[j].charAt(i)){
        //             return sb.toString();
        //         }
        //     }
        //     sb.append(str[0].charAt(i));
        // }
        // return sb.toString();
    }
}