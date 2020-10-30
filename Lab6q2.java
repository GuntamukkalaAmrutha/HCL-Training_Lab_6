package Lab6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Lab6q2 {
	
	public static void main(String[] args) {
		
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("demo.txt"));
		} catch (FileNotFoundException e1) {
			
			e1.printStackTrace();
		}
		
		String sentence = null;
		try {
			while(( sentence = br.readLine()) != null) {
				String[] tokens =  sentence.split(" ");
				for(String token: tokens) {
					if(hashMap.containsKey(token)) {
						int value = hashMap.get(token);
						hashMap.put(token, ++value);
						
					} else {
						hashMap.put(token, 1);
					}
				}
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Set<Entry<String, Integer>> entrySet = hashMap.entrySet();
		for(Entry<String, Integer> setItem : entrySet) {
			System.out.println(setItem.getKey() + " appear " + setItem.getValue() + " times ");
		}
	}

}