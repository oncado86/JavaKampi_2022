package Homeworks.Homework_1.h01_OOP.business;

public abstract class BaseCreditManager implements ICreditManager {
    public abstract void calculate();

    @Override
    public void save() {
        System.out.println("Kaydedildi.");
    }

}
