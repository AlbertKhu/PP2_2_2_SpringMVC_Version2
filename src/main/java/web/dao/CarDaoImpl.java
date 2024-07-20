package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("BMW", "X", 5));
        carList.add(new Car("Mercedes", "GL", 500));
        carList.add(new Car("Lamborghini", "Miura", 1));
        carList.add(new Car("Ferrari", "Portofino", 1));
        carList.add(new Car("Pagani", "Zonda", 1));
    }

    @Override
    public List<Car> getCars(Integer count) {
        if (count == 0) {
            return carList;
        } else if (count == null) {
            throw new IllegalArgumentException("Count cannot be null");
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}