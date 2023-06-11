package Sort;

import java.util.Arrays;
import java.util.HashMap;

public class SelectionSort {
    public static void main(String[] args) {

    }
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> map = new HashMap<>();
        int k=0;
        for( int i=0; i<heights.length; i++ ){
            map.put(heights[i], names[i]);

        }
        //sort key
        Arrays.sort(heights);
        String[] res = new String[names.length];

        for( int i=heights.length-1, j=0; i>=0; i--){
            res[j++] = map.get(heights[i]);

        }
        return res;
    }
}
