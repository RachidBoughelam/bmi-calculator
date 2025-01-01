package org.rachiboughelam;

abstract class Person implements DisplayInfo {

    protected int sizeCm;
    protected double weight;

    public Person(int sizeCm, double weight) {
        this.sizeCm = sizeCm;
        this.weight = weight;
    }

    public int getSizeCm() {
        return sizeCm;
    }

    public void setSizeCm(int sizeCm) {
        this.sizeCm = sizeCm;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract double calculateBMI();

    public void displayDetails() {
        System.out.printf("Height: %d cm, Weight: %.2f kg%n", sizeCm, weight);
    }
}