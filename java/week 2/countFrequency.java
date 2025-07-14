import java.util.HashMap;

class countFrequency {
    public static HashMap<Integer, Integer> freq(int[] arr) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            if (freqMap.containsKey(num)) {
                freqMap.put(num, freqMap.get(num) + 1);
            } else {
                freqMap.put(num, 1);
            }
        }
        return freqMap;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4, 5, 7, 4, 3, 2};
        HashMap<Integer, Integer> result = freq(arr);
        for (int key : result.keySet()) {
            System.out.println(key + " → " + result.get(key) + " time(s)");
        }
    }
}
