package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarImplDao implements CarDao{

    List<Car> cars;

    { cars = new ArrayList<>();
      cars.add(new Car(1, "BMW", 50000));
      cars.add(new Car(2, "Tesla", 1000000));
      cars.add(new Car(3, "ToyotaLandCruiser", 230000));
      cars.add(new Car(4, "Lexus", 780000));
      cars.add(new Car(5, "Mercedes-Benz", 90000));



    }



    @Override
    public List<Car> getByNum(int num) {
        List<Car> carList = new ArrayList<>();
        for (int i = 0; i < num; i++){
            if (num > 5){
                return cars;
            } else {
                carList.add(getAllCars().get(i));
            }
        }
        return carList;
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }
}

