package org.rachiboughelam;

import java.util.List;

class Task implements Runnable {

    private final List <Person> people;
    private final Person person;

    public Task(List<Person> people, Person person) {
        this.people = people;
        this.person = person;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            people.add(person);
            System.out.println("Person added successfully in background!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}