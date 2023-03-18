package generics;

import java.util.ArrayList;
import java.util.List;

public class javaEx {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Hi");
        list.add(12);

        List<String> list2 = new ArrayList<>();
        list2.add("Hello");
        // list2.add(11);
    }
}
