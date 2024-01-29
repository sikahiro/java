package Test8;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test15 {
    public static void main(String[] args){
        Map<String,String> map =new LinkedHashMap<>();
        System.out.println("野菜    :季節");
        map.put("キャベツ", "春");
        map.put("スイカ", "夏");
        map.put("ナス", "秋");
        map.put("ハクサイ", "冬");
        for (String key:map.keySet())
            if ((map.get(key))=="春")
                System.out.println(key+":"+map.get(key));
        
    }
}
