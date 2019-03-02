package ac.za.cput;

import java.util.*;

public class ListApp {

    public List<String> myList (){

        List<String> myList = new ArrayList();

        myList.add("Red");
        myList.add("Yellow");
        myList.add("Blue");

        return myList;

    }

    public  Set<String> mySet(){

        Set setA = new HashSet();

        setA.add("set 1");
        setA.add("set 2");
        setA.add("set 3");

        return setA;
    }

    public Map<String,String> myMap () {

        Map mapA = new HashMap();

        mapA.put("key1", "element 1");
        mapA.put("key2", "element 2");
        mapA.put("key3", "element 3");

        return mapA;
    }

}
