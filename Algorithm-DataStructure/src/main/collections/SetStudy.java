package main.collections;

import java.util.*;

public class SetStudy {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("italo@gmail.com");
        arrayList.add("italo@gmail.com");
        arrayList.add("italo@gmail.com");
        arrayList.add("italo@gmail.com");

        Set<String> setList = new HashSet<>(arrayList);
        System.out.println(setList);


    }


}
