import java.util.HashMap;
import java.util.Map;

public class EncodeandDecodeTinyURL535 {
    static Map<Integer, String> map = new HashMap<>();
    static int i = 0;
    // Encodes a URL to a shortened URL.
    public static String encode(String longUrl) {
        map.put(i, longUrl);
        return "http://tinyurl.com/" + i++;
    }

    // Decodes a shortened URL to its original URL.
    public static int decode(String shortUrl) {
//        return map.get(Integer.parseInt(shortUrl.replace("http://tinyurl.com/", "")));
        return Integer.parseInt(shortUrl.replace("http://tinyurl.com/", ""));
    }

    public static void main(String[] args) {
        String url = "https://leetcode.com/problems/design-tinyurl";
        EncodeandDecodeTinyURL535 codec = new EncodeandDecodeTinyURL535();
        //EncodeandDecodeTinyURL535.decode(EncodeandDecodeTinyURL535.encode(url));
        System.out.println(EncodeandDecodeTinyURL535.encode(url));
        System.out.println(EncodeandDecodeTinyURL535.decode(EncodeandDecodeTinyURL535.encode(url)));
    }
}
