package com.carDetails.Repository;

import com.carDetails.Entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CarRepository extends JpaRepository<Car, Integer> {

    Car findByvin(String vin);
}
