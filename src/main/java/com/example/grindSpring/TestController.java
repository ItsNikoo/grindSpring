package com.example.grindSpring;

import org.springframework.web.bind.annotation.*;
import service.CarServiceRealization;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@RestController
@RequestMapping("/cars")
public class TestController {
    private final CarServiceRealization service = new CarServiceRealization();
    String message = "Сообщение";

    @GetMapping("/message")
    public String showMessage(){
        return message;
    }

    /*@GetMapping("/cars")
    public List<Car> showCars(){
        List<Car> cars = new ArrayList<>();
        Car mercedes = new Car("Mercedes","GLE 63 AMG", 2021,"abacadaba");
        Car audi = new Car("Audi", "RSQ8", 2024, "wuioeghfw");
        Car unknown = new Car();
        cars.add(mercedes);
        cars.add(audi);
        cars.add(unknown);
        return cars;
    }*/

    @GetMapping("/showcars")
    public List<Car> returnCars(){
        return service.returnCars();
    }

    @GetMapping("/{id}")
    public Car findCar(@PathVariable String id) {
        return service.findCar(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCar(@PathVariable String id){
        service.deleteCar(id);
    }

    @PostMapping("/savecar")
    public String saveCar(@RequestBody Car car) {
        service.saveCar(car);
        return "Successfully added";
    }

}
