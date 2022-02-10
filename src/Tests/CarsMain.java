package Tests;

import SolutionsCars.*;

public class CarsMain {

    public static void main(String[] args) {
        System.out.println("Testing OOP assignment...");

        BMWCar bmw_car = new BMWCar();
        BMWMotorBike bmw_motorbike = new BMWMotorBike();
        VMCar vm_car = new VMCar();

        System.out.println(brandString(bmw_car) + " " + isCarOrMotorBike(bmw_car) + " " + howManyWheels(bmw_car));
        System.out.println(brandString(bmw_motorbike) + " " + isCarOrMotorBike(bmw_motorbike) + " " + howManyWheels(bmw_motorbike));
        System.out.println(brandString(vm_car) + " " + isCarOrMotorBike(vm_car) + " " + howManyWheels(vm_car));

    }


    //String having the brand of the Brand object
    private static String brandString(Brand brand){
        return "Brand : "+brand.getBrandName();
    }

    //String saying if it's a car or a motorbike
    private static String isCarOrMotorBike(Vehicle vehicle) {
        return "Is a "+ (vehicle instanceof Car ? "car" : " motorbike");
    }


    //String saying how many wheels the Vehicle has
    private static String howManyWheels(Vehicle vehicle){
        return "has "+vehicle.getWheels() + " wheels";
    }

}
