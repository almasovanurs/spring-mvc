package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.dao.CarImplDao;
import web.model.Car;

import java.util.List;

@Component
public class ServiceCarImpl implements ServiceCar {

    private CarDao carDao = new CarImplDao();
    @Override
    public List<Car> getByNum(int num) {
        return carDao.getByNum(num);
    }

    @Override
    public List<Car> getAllCars() {
        return carDao.getAllCars();
    }
}
