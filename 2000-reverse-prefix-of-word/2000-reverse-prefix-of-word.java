class Solution {
    public String reversePrefix(String word, char ch) {
        String p1 = word.substring(0,word.indexOf(ch)+1);
        String p2 = word.substring(word.indexOf(ch)+1);
        System.out.println(p1);
        System.out.println(p2);
        StringBuffer sb = new StringBuffer(p1).reverse();
        return sb + p2;
    }
}