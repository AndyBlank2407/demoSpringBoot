package de.neuefische.demospringboot;
import java.util.List;

public class CarService {

    private CarRepository carRepository = new CarRepository();

    public void addCar(Car car) {
        carRepository.addCar(car);
    }

    public List<Car> getCar(){
        carRepository.getCars();
    }

}
