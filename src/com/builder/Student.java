package com.builder;

public class Student {
	private int id;
	private String name;
	private String psp;
	private int year;
	private String adress;

	private Student(StudentBuilder builder) {
		this.id = builder.getId();
		this.name = builder.getName();
		this.psp = builder.getPsp();
		this.year = builder.getYear();
		this.adress = builder.getAdress();
	}

	private Student() {	}

	static class StudentBuilder {
		private int id;
		private String name;
		private String psp;
		private int year;
		private String adress;

		private StudentBuilder() {}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public StudentBuilder setName(String name) {
			this.name = name;
			return this;
		}

		public String getPsp() {
			return psp;
		}

		public StudentBuilder setPsp(String psp) {
			this.psp = psp;
			return this;
		}

		public int getYear() {
			return year;
		}

		public StudentBuilder setYear(int year) {
			this.year = year;
			return this;
		}

		public String getAdress() {
			return adress;
		}

		public StudentBuilder setAdress(String adress) {
			this.adress = adress;
			return this;
		}

		public Student build() {
			if (this.getYear() > 2023) {
				throw new IllegalArgumentException("Year shouldn't be greter than current year");
			}
			Student st = new Student();
			st.id = this.getId();
			st.name = this.getName();
			st.psp = this.getPsp();
			st.year = this.getYear();
			st.adress = this.getAdress();
			return st;
		}
	}

	public static StudentBuilder getBuilder() {
		return new StudentBuilder();
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", psp=" + psp + ", year=" + year + ", adress=" + adress + "]";
	}

}
