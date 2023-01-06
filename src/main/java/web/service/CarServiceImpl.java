package web.service;

import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    public List<Car> getCars(List<Car> cars, int count) {

        if (count < 5) {
            return cars.subList(0, count);
        }
        else {
            return cars;
        }
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
