package org.example;

public class App {
    public void run(){
        Address address = new Address();
        address.setCity("Йыхви");
        address.setState("Ида-Вирумаа");
        address.setZip("41536");
        address.setStreet("Нарвское шоссе");
        address.setHouse("80");
        address.setRoom("20");
        Person person = new Person("Ivan", "Ivanov", 10, 10, 2000, address);
        Employee employee = new Employee(person, "Director", "3000");


    }
}
