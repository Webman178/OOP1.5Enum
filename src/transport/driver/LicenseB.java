package transport.driver;

import transport.Car;

public class LicenseB extends Driver<Car>{

    public LicenseB(String nameDriver,
                    boolean drivingLicence,
                    int experience) {
        super(nameDriver, drivingLicence, experience);
    }

    @Override
    public void startMoving(Car transport) {
        transport.start();
    }

    @Override
    public void stopMoving(Car transport) {
        transport.finish();
    }

    @Override
    public void refuel(Car transport) {
        System.out.println("Водитель " + getNameDriver() + " заправляет автомобиль " +
                transport.getBrand() + transport.getModel());
    }
}
