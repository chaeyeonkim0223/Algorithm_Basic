package jungol.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class 단어세기_1516 {
    

	static Map<String, Integer> freqMap;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
        	String input = br.readLine();
        	if(input.equals("END")) break;
        	freqMap = new HashMap<String, Integer>();
        	StringTokenizer st = new StringTokenizer(input," ");
        	while(st.hasMoreTokens()) {
        		mapExec(st.nextToken());
        	}
            List<String> keys = new ArrayList<>(freqMap.keySet());
            Collections.sort(keys);
            for (String key : keys) {
                System.out.println(String.format("%s : %s", key, freqMap.get(key)));
            }
        }
    }
    static void mapExec(String word) {
        Integer count = freqMap.get(word);
        if (count == null) {
            freqMap.put(word, 1);
        } else {
            freqMap.put(word, count + 1);
        }
    }
}