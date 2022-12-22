package transport.driver;

import transport.Transport;

public abstract class Driver<T extends Transport> {
    private final String nameDriver;
    private boolean drivingLicence;
    private int experience;

    public Driver(String nameDriver,
                  boolean drivingLicence,
                  int experience) {
        this.nameDriver = nameDriver;
        this.drivingLicence = drivingLicence;
        this.experience = experience;
    }

    public String getNameDriver() {
        return nameDriver;
    }

    public boolean isDrivingLicence() {
        return drivingLicence;
    }

    public void setDrivingLicence(boolean drivingLicence) {
        this.drivingLicence = drivingLicence;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public abstract void startMoving(T transport);

    public abstract void stopMoving(T transport);

    public abstract void refuel(T transport);

    public void printHomework(T transport) {
        System.out.println("Водитель " + nameDriver + " управляет автомобилем " + transport.getBrand()
                + " и будет участвовать в заезде");
    }
}
