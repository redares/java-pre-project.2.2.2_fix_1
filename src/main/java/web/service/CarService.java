package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getCars(List<Car> cars, int count);
    List<Car> addCars();
}
