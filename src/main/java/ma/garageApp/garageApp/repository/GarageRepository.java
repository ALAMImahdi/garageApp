package ma.garageApp.garageApp.repository;

import ma.garageApp.garageApp.model.Car;
import org.springframework.data.repository.CrudRepository;

public interface GarageRepository extends CrudRepository<Car,Long> {
}
