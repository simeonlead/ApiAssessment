package com.carDetails.Service;

import com.carDetails.Entity.Car;
import com.carDetails.Repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository repository;

    public Car addCar(Car car){
       return repository.save(car);
    }
    public List<Car> addCars(List<Car>  cars){
        return repository.saveAll(cars);
    }
    public List<Car> getCars(){
        return repository.findAll();
    }
    public Car getCarByvin( String vin){
        return repository.findByvin(vin);
    }

    public  Car updateCar(Car car){
        Car existingCar = repository.findByvin(car.getVin());
        existingCar.setVin(car.getVin());
        existingCar.setBrand(car.getBrand());
        existingCar.setYear(car.getYear());
        existingCar.setColor(car.getColor());
        return repository.save(existingCar);
    }

}
