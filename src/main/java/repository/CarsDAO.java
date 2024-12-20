package repository;

import com.example.grindSpring.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class CarsDAO {
    private final List<Car> cars = new ArrayList<>();

    public Car findCar(String id) {
        return cars.stream().filter(car -> car.getId().equals(id)).findFirst().orElse(null);
    }

    public List<Car> returnCars() {
        return cars;
    }

    public void deleteCar(String id) {
        boolean removed = cars.removeIf(car -> car.getId().equals(id));
        if (removed) {
            System.out.println("Машина с id " + id + " успешно удалена.");
        } else {
            System.out.println("Машина с id " + id + " не найдена.");
        }
    }



    public void saveCar(Car car) {
        cars.add(car);
    }
}
