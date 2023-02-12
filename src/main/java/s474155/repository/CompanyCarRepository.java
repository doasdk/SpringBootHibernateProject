package s474155.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import s474155.model.CompanyCar;

@Repository
public interface CompanyCarRepository extends JpaRepository<CompanyCar, Long> {


}
