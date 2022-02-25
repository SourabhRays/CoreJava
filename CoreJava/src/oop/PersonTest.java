package oop;

public class PersonTest {

	public static void main(String[] args) {

		Person p = new Person();
		
		p.setName("Ram");
		p.setAddress("Ayodhya");
		
		String name = p.getName();
		String address = p.getAddress();
		
		System.out.println(name +" from "+ address);
	}

}
