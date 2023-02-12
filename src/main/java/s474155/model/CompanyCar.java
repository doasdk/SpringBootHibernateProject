package s474155.model;

import jakarta.persistence.*;
import lombok.Cleanup;

@Entity
@Table(name = "company_car")
public class CompanyCar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long carId;
    @Column(name = "licenseNum")
    private int licenseNum;
    @Column(name = "model")
    private String model;




    public CompanyCar() {
    }

    public CompanyCar(Long carId, int licenseNum, String model) {
        this.carId = carId;
        this.licenseNum = licenseNum;
        this.model = model;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public int getLicenseNum() {
        return licenseNum;
    }

    public void setLicenseNum(int licenseNum) {
        this.licenseNum = licenseNum;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
