package com.builder;

public class StudentTest {
	public static void main(String[] args) {
		// step-1
//		StudentBuilder b = Student.getBuilder()
//				.setAdress("SOR").setName("BIKASH").setYear(2023);
//		Student st = new Student(b);
		
		// step-2, make build() 
		Student st = Student.getBuilder()
				.setAdress("SOR").setName("BIKASH").setYear(2023).build();
		
		System.out.println(st);
	}
}
