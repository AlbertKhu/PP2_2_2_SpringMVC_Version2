package web.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.controller.CarController;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.service.CarService;
import web.service.CarServiceImpl;

@Component
public class Car {
    private CarDaoImpl carDao;
    private String brand;
    private String model;
    private int series;

    public Car() {
    }

    public Car(String brand, String model, int series) {
        this.brand = brand;
        this.model = model;
        this.series = series;
    }

    @Autowired
    public Car(CarDaoImpl carDao) {
        this.carDao = carDao;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

}
