import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(0, "Фёдор");
        hashMap.put(1, "Максим");
        hashMap.put(2, "Настя");
        hashMap.put(3, "Кирилл");
        hashMap.put(4, "Иван");
        MapHash mapHash = new MapHash();
        mapHash.keyMap(hashMap);

        char[] s = "abcdef".toCharArray();
        int[] array = {4,2,3,1,5,6};

        for (int i = 0; i < array.length; i++) {
            System.out.println(s[array[i]-1]);
        }

        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put("Фёдор", 1);
        hashMap2.put("Максим", true);
        hashMap2.put("Настя", "Tik");
        hashMap2.put("Кирилл", 2.2);
        hashMap2.put("Иван", "Cat");

        mapHash.valueMap(hashMap2);
    }
}
