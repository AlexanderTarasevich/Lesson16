package TMS;

import java.util.HashMap;
import java.util.Map;

public class Pairs {
    public static void main(String[] args) {
        System.out.println(pairs(new String[]{"code", "bug"}));
        System.out.println(pairs(new String[]{"man", "moon", "main"}));
        System.out.println(pairs(new String[]{"man", "moon", "good", "night"}));
    }

    public static Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String s : strings) {
            map.put(s.substring(0, 1), s.substring(s.length() - 1));
        }
        return map;
    }
}
