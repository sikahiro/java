package Test8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

class Test14 {
    public static void main(String[] args){
        Map<String,String> map =new LinkedHashMap<>();
        map.put("野菜", "季節");
        map.put("キャベツ", "春");
        map.put("スイカ", "夏");
        map.put("ナス", "秋");
        map.put("ハクサイ", "冬");
        for (String key:map.keySet()){
            String value =map.get(key);
            System.out.println(key+":"+value);
        }
    }
}
