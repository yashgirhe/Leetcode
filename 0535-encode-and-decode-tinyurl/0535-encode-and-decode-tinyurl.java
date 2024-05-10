public class Codec {
    
    public static void main(String[] args){
        Codec codec = new Codec();
        codec.decode(codec.encode("https://leetcode.com/problems/design-tinyurl"));
    }
    
    static int num = 0;
    static HashMap<String, Integer> hm = new HashMap<>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        num++;
        String newUrl = "http:tinyurl.com/";
        newUrl = newUrl + num;
        hm.put(longUrl, num);
        return newUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        int hash = 0;
        String decodedUrl = "no such url encoded";
        String[] parts = shortUrl.split("/");
        String num = parts[parts.length - 1];
        hash = Integer.parseInt(num);
        System.out.println(hash);
        for (Map.Entry<String, Integer> i : hm.entrySet()) {
            if (i.getValue() == hash) {
                decodedUrl = i.getKey();
            }
        }
        return decodedUrl;
    }
}

// Your Codec object will be instantiated and called as such: