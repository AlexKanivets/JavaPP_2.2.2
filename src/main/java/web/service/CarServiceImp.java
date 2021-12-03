package web.service;

import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImp implements CarService {

    @Override
    public List<Car> getCarList(List<Car> carList, Integer count) {
        if (count == null) {
            return carList;
        } else {
            return carList.stream().limit(count).collect(Collectors.toList());
        }
    }
}
