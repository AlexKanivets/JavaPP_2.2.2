package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;

import java.util.ArrayList;
import java.util.List;


@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String getCar(@RequestParam(value = "count", required = false) Integer count, Model model) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("BMW 5 серии 540i xDrive VII (G30/G31)", "Синий", 2020, 5500000));
        carList.add(new Car("Ford Focus III", "Белый", 2014, 570000));
        carList.add(new Car("Audi A6 IV (C7) Рестайлинг", "Черный", 2015, 1350000));
        carList.add(new Car("Mercedes-Benz AMG GT 43 I Рестайлинг", "Белый", 2019, 7085000));
        carList.add(new Car("Volkswagen Tiguan II Рестайлинг", "Бежевый", 2021, 1850000));
        CarService carService = new CarServiceImp();
        model.addAttribute("carList", carService.getCarList(carList,count));
        return "cars";
    }
}
