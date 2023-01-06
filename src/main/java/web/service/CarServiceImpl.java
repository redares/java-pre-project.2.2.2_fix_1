package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    public List<Car> getCars(List<Car> cars, int count) {
        return cars.subList(0, count);
    }

    public List<Car> addCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "aaa", 111));
        cars.add(new Car(2, "bbb", 222));
        cars.add(new Car(3, "ccc", 333));
        cars.add(new Car(4, "ddd", 444));
        cars.add(new Car(5, "eee", 555));

        return cars;
    }
}
