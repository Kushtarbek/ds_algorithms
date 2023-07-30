package HashMap;

import java.util.HashMap;

public class FindUniqueCharInString {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();//Creating a hashmap which will take avery character and note its occurrence.
        for(int i = 0 ; i < s.length() ; i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i = 0 ; i < s.length() ; i++){
            if(map.get(s.charAt(i))==1) return i;//If the occurrence of any char is once, then it is the required ans
        }
        return -1;//else returning -1
    }
}
