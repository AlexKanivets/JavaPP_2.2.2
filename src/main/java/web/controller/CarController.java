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
import java.util.stream.Collectors;


@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String getCar(@RequestParam(value = "count", required = false) Integer count, Model model) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("model1", "color1", "year1"));
        carList.add(new Car("model2", "color2", "year2"));
        carList.add(new Car("model3", "color3", "year3"));
        carList.add(new Car("model4", "color4", "year4"));
        carList.add(new Car("model5", "color5", "year5"));
        CarService carService = new CarServiceImp();
        model.addAttribute("carList", carService.getCarList(carList,count));
        return "cars";
    }
}
