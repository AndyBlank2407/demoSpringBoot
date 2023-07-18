package de.neuefische.demospringboot;
import java.util.List;

public class CarService {

    private CarRepository carRepository = new CarRepository();

    public Car addCar(Car car) {
        carRepository.addCar(car);
        return car;
    }

    public List<Car> getCar(){
      return  carRepository.getCars();
    }

}
