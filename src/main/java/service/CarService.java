package service;

import com.example.grindSpring.Car;

import java.util.List;

public interface CarService {
    public Car findCar(String id);
    public void deleteCar(String id);
    public void saveCar(Car car);
    public List<Car> returnCars();
}
