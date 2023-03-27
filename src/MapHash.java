import java.util.HashMap;
import java.util.Map;


public class MapHash {
    public void keyMap(HashMap<Integer, String> map) {
        System.out.println(map.keySet());

        for (Map.Entry<Integer, String> item : map.entrySet()) {
            System.out.println(item.getKey());
        }
    }

    public  void valueMap(HashMap<String, Object> map) {
        System.out.println(map.values());

        for (Map.Entry<String, Object> item : map.entrySet()) {
            System.out.println(item.getValue());
        }
    }
}
