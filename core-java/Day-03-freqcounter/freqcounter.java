import java.util.HashMap;
public class freqcounter{
    public static void main(String[] args){
        String s = "aaabbccdderer";

        HashMap<Character, Integer> freqMap = new HashMap<>();

        for(char c : s.toCharArray()){
            freqMap.put(c,freqMap.getOrDefault(c,0)+1);
        }
        System.out.println("Character Frequency:" + freqMap);
    }
}