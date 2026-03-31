package BridgeLabz_Day24_HashMapHashFunctions;

public class ImplementCustomHashMapMain {
    public static void main(String[] args) {
        ImplementCustomHashMap<String, Integer> map = new ImplementCustomHashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 30);
        System.out.println("Apple : " + map.get("Apple"));
        System.out.println("Banana : " + map.get("Banana"));
        System.out.println("Orange : " + map.get("Orange"));
        map.put("Apple", 50);
        System.out.println("Updated Apple : " + map.get("Apple"));
        System.out.println("Removed Banana : " + map.remove("Banana"));
        System.out.println("Banana after removal : " + map.get("Banana"));
    }
}
