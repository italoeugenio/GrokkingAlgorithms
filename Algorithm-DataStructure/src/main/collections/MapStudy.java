package main.collections;

import java.util.HashMap;
import java.util.Map;

public class MapStudy {

    public static boolean isAnagram(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        HashMap<Character, Integer> dic = new HashMap<>();
        for (int i = 0; i < word1.length(); i++) {
            if (!dic.containsKey(word1.charAt(i))) {
                dic.put(word1.charAt(i), 0);
            }
        }

        for(int j = 0; j < word2.length(); j++){
            if(!dic.containsKey(word2.charAt(j))){
                return false;
            }
        }

        return true;
    }



    public static void main(String[] args) {
        Map<Integer, String> dic = new HashMap<>();

        String word1 = "anagram";
        String word2 = "nagaram";

    isAnagram(word1,word2);
    }
}

