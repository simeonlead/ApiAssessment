package Controller;

import Entity.Car;
import Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {

    @Autowired
    private CarService service;

    @PostMapping("/addCar")
    public Car addCar(@RequestBody Car car){
         return  service.addCar(car);
    }

    //Add Cars to the Databse
    @PostMapping("/addCars")
    public List<Car> addCars(@RequestBody List<Car> cars){
        return  service.addCars(cars);
    }
    // Populate All Cars in the Database
    @GetMapping("/cars")
    public  List<Car> findAllCars(){
        return service.getCars();
    }
    // find individual car using vin
    @GetMapping("/cars/{vin}")
    public Car getCarByvin(@PathVariable String vin){
        return service.getCarByvin(vin);
    }

    // Update Car detail
    @PutMapping("/updateCar")
    public Car upadateCar(@RequestBody Car car){
        return  service.updateCar(car);
    }

}
