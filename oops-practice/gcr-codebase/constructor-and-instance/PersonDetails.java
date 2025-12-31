package constructorAndInstance;

class Person {
    String name;
    int age;

    // this is the parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // copy constructor
    Person(Person p) {
        // here we are copying values from another object
        this.name = p.name;
        this.age = p.age;
    }
}

public class PersonDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
