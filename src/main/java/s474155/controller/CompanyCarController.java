package s474155.controller;

import org.springframework.web.bind.annotation.*;
import s474155.model.CompanyCar;
import s474155.service.CompanyCarService;

import java.util.List;
import java.util.Optional;

@RestController

public class CompanyCarController {

    private final CompanyCarService companyCarService;

    public CompanyCarController(CompanyCarService companyCarService) {
        this.companyCarService = companyCarService;
    }

    @GetMapping("/company_cars")
    public List<CompanyCar> findAllCars(){
        return companyCarService.findAllCars();
    }

    @GetMapping("/company_cars/{id}")
    public Optional<CompanyCar> findCarById(@PathVariable("id")Long id){
        return companyCarService.findById(id);
    }

    @PostMapping("/company_cars")
    public CompanyCar saveCar(@RequestBody CompanyCar companyCar){
        return companyCarService.saveCar(companyCar);
    }

    @PutMapping("/company_cars")
    public CompanyCar updateCar(@RequestBody CompanyCar companyCar){
        return companyCarService.updateCar(companyCar);
    }

    @DeleteMapping("/company_cars/{id}")
    public void deleteCar(@PathVariable("id")Long id){
        companyCarService.deleteCar(id);
    }








}
