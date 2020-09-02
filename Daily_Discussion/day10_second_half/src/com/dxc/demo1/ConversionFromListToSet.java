package com.dxc.demo1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

// How we can convert from set to list
// Through constructors
// similarly we can do between list to set
public class ConversionFromListToSet {

	public static void main(String[] args) {
	 List<String> listNames=new ArrayList<>();
    //Set<String> setNames=new HashSet<>();
	 // to continue with the same sequence of the list
	 // ( insertion order ) and to remove repeated values
	 Set<String> setNames=new LinkedHashSet<>();
	 listNames.add("Zuben");
    listNames.add("Abhay");
    listNames.add("Niraj");
    listNames.add("Niraj");
    System.out.println(listNames);
    setNames.addAll(listNames);
    System.out.println(setNames);

	}

}
