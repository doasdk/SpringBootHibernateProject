package s474155.service.implementation;

import org.springframework.stereotype.Service;
import s474155.model.CompanyCar;
import s474155.repository.CompanyCarRepository;
import s474155.service.CompanyCarService;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyCarServiceImpl implements CompanyCarService {

    private final CompanyCarRepository companyCarRepository;

    public CompanyCarServiceImpl(CompanyCarRepository companyCarRepository) {
        this.companyCarRepository = companyCarRepository;
    }

    @Override
    public List<CompanyCar> findAllCars() {
        return companyCarRepository.findAll();
    }

    @Override
    public Optional<CompanyCar> findById(Long id) {
        return companyCarRepository.findById(id);
    }

    @Override
    public CompanyCar saveCar(CompanyCar companyCar) {
        return companyCarRepository.save(companyCar);
    }

    @Override
    public CompanyCar updateCar(CompanyCar companyCar) {
        return companyCarRepository.save(companyCar);
    }

    @Override
    public void deleteCar(Long id) {
        companyCarRepository.deleteById(id);
    }
}
