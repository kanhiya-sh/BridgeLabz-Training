package Capgemini_Day16_Inheritance;

interface Worker { // using interface because java does not support multiple inheritance
    void performDuties();
}

class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Chef extends Person implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }
    @Override
    public void performDuties() {
        System.out.println("Chef " + name + " is cooking food");
    }
}

class Waiter extends Person implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }
    @Override
    public void performDuties() {
        System.out.println("Waiter " + name + " is serving customers");
    }
}

public class RestroManagementSystem {
    public static void main(String[] args) {
        Worker w1 = new Chef("Kanhiya", 101);
        Worker w2 = new Waiter("Waiter", 102);
        w1.performDuties();
        w2.performDuties();
    }
}
