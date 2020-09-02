package day3;

public class PersonMain2 {

	// person1 and person2 gets initialised with the parameterized constructor
	// whereas person3 gets initialised with the default one 
	public static void main(String[] args) {
	Person1 person1=new Person1(21,"Ram");
	person1.displayData(); 
	
	Person1 person2=new Person1(20,"Tom");
	person2.displayData();
	
	Person1 person3=new Person1();
	person3.displayData();

	}

}
