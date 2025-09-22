package Constructors_Instance;
public class person{
	    private String name;
	    private int age;
	    public  person (String name, int age) {
	        this.name = name;
	        this.age = age;
	    }
	    public  person ( person  otherPerson) {
	        this.name = otherPerson.name;
	        this.age = otherPerson.age;
	    }
	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }
	    public String toString() {
	        return "Person [Name: " + name + ", Age: " + age + "]";
	    }
	    public static void main(String[] args) {
	    	 person originalPerson = new  person ("rohit", 19);
	        System.out.println("Original " + originalPerson);
	        person copiedPerson = new  person (originalPerson);
	        System.out.println("Copied " + copiedPerson);
	        copiedPerson.setName("siyaram");
	        copiedPerson.setAge(25);
	        System.out.println("Modified Copied " + copiedPerson);
	    }
	}