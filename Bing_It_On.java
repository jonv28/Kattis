import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
public class Bing_It_On {


    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String word;
        String[] letters;
        Hashtable<String, Integer> map = new Hashtable<>(100000);
        for (int i = 0; i < n; i++) {
            word = sc.next();
            if(map.containsKey(word)){
               System.out.println(map.get(word));;
            }
            else System.out.println(0);
            String pre = word;
            if (map.containsKey(pre)) {
                map.put(pre, map.get(pre) + 1);
            } else {
                map.put(pre, 1);
            }
            letters = word.split("");
            for (int j = letters.length - 1; j >= 0; j--) {
                pre = pre.substring(0, pre.length() - 1);
                if (map.containsKey(pre)) {
                    map.put(pre, map.get(pre) + 1);
                } else {
                    map.put(pre, 1);
                }
            }
        }
        sc.close();
    }
}

