package Controller;

import Entity.Car;
import Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {

    @Autowired
    private CarService service;

    @PostMapping("/addCar")
    public Car addCar(@RequestBody Car car){
         return  service.addCar(car);

        }
    public List<Car> addCars(@RequestBody List<Car> cars){
        return  service.addCars(cars);

    }
}
