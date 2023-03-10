package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    private final CarService carService;

    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String showCars(ModelMap model, @RequestParam(name = "count", defaultValue = "5") String count) {

        List<Car> cars = carService.addCars();
        model.addAttribute("cars", carService.getCars(cars, Integer.parseInt(count)));

        /*
        if (Integer.parseInt(count) < 5) {
            model.addAttribute("cars", carService.getCars(cars, Integer.parseInt(count)));
        }
        else {
            model.addAttribute("cars", cars);
        }
        */


        return "cars";
    }
}
