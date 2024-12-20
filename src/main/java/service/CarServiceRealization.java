package service;

import com.example.grindSpring.Car;
import org.springframework.stereotype.Service;
import repository.CarsDAO;

import java.util.List;

@Service
public class CarServiceRealization implements CarService{
    private final CarsDAO database = new CarsDAO();

    @Override
    public Car findCar(String id) {
        return database.findCar(id);
    }

    @Override
    public void deleteCar(String id) {
        var car = database.findCar(id);
        database.deleteCar(id);
    }

    @Override
    public void saveCar(Car car) {
        database.saveCar(car);
    }

    @Override
    public List<Car> returnCars() {
        return database.returnCars();
    }
}
