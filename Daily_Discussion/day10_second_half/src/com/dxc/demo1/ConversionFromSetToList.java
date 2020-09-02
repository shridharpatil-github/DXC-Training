package com.dxc.demo1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// How we can convert from set to list
// Through constructors
// similarly we can do between list to set
// For copying from one collection to another
// collection , we should use addAll
public class ConversionFromSetToList {

	public static void main(String[] args) {

    Set<String> setNames=new HashSet<>();
    setNames.add("Abhay");
    setNames.add("Niraj");
    setNames.add("Raju");
    List<String> listNames=new ArrayList<>();
    listNames.addAll(setNames);
    System.out.println(listNames);

	}

}
