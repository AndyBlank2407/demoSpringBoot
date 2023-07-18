package de.neuefische.demospringboot;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    CarService carService1 = new CarService();
    @PostMapping
    public Car addCarToCarPool(@RequestBody Car car){
        carService1.addCar(car);
        return car;
    }

    @GetMapping
    public List<Car> getCar(){
       return carService1.getCar();
    }

}
