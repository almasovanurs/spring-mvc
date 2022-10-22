package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {

    public List<Car> getByNum (int num);

    public List<Car>  getAllCars ();

}
