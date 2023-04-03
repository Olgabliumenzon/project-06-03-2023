package com.sda.she_likes_java.static_modifier;

public class WashMachine {

    private static int numberOfCreatedMachines;
    private String brand;
    private String model;
    private int serialNumber;

    public WashMachine(String brand, String model) {
        this.brand = brand;
        this.model = model;
        numberOfCreatedMachines++;
        serialNumber++;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public static void setNumberOfCreatedMachines(int numberOfCreatedMachines) {
        WashMachine.numberOfCreatedMachines = numberOfCreatedMachines;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public static int getNumberOfCreatedMachines() {
        return numberOfCreatedMachines;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "WashMachine{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}