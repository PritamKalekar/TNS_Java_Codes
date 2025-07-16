package com.multilevelInheritance;

public class MLInheritanceDemo {

	public static void main(String[] args) {

		Person p1 = new Person("Ram", 9876543321L);
		System.out.println(p1);
		
		p1 = new Employee("Sham", 9087921234L,"Sales", 67890);
		System.out.println(p1);
		
		p1= new LevelOneEmployee("Om",8976543219L,"IT",100000,100,"Signning Authority");
		System.out.println(p1);
		
	}
}
