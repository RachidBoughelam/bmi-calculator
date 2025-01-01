package org.rachiboughelam;

class Student extends Person {
    public Student(int sizeCm, double weight) {
        super(sizeCm, weight);
    }

    @Override
    public double calculateBMI() {
        double sizeM = sizeCm / 100.0;
        return weight / (sizeM * sizeM);
    }
}