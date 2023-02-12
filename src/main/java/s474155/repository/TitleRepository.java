package s474155.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import s474155.model.Title;

@Repository
public interface TitleRepository extends JpaRepository<Title, Long> {




}
