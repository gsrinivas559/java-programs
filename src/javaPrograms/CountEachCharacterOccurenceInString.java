package javaPrograms;

import java.util.HashMap;
import java.util.Map;

public class CountEachCharacterOccurenceInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="aa1@bb4c5c";
		Map<Character, Integer> charMap=new HashMap<>();
		for(char c:name.toCharArray()) {
			charMap.put(c, charMap.getOrDefault(c, 0)+1);
		}
		for(Map.Entry<Character, Integer> entry:charMap.entrySet()) {
			System.out.println(entry.getKey()+":::"+entry.getValue());
		}
	}

}
