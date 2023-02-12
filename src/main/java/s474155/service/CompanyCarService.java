package s474155.service;

import s474155.model.CompanyCar;

import java.util.List;
import java.util.Optional;

public interface CompanyCarService {

    List<CompanyCar> findAllCars();
    Optional<CompanyCar> findById(Long id);
    CompanyCar saveCar(CompanyCar companyCar);
    CompanyCar updateCar(CompanyCar companyCar);
    void deleteCar(Long id);


}
