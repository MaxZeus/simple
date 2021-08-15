package old;

import java.util.*;

class A {

    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("Max", "Kiriyak");
        map.put("Mark", "Tkach");
        map.put("Alexandr", "Alexeev");


        map.forEach((key, value) -> System.out.println(key + " " + value));
    }


}