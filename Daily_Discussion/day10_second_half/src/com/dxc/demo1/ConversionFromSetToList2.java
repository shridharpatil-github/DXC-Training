package com.dxc.demo1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// How we can convert from set to list
// Through constructors
// similarly we can do between list to set
public class ConversionFromSetToList2 {

	public static void main(String[] args) {

    Set<String> setNames=new HashSet<>();
    setNames.add("Abhay");
    setNames.add("Niraj");
    List<String> listNames=new ArrayList<>(setNames);
    System.out.println(listNames);

	}

}
