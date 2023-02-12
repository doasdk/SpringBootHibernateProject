package s474155.service;

import s474155.model.Title;

import java.util.List;
import java.util.Optional;

public interface TitleService {

    List<Title> findAllTitles();
    Optional<Title> findById(Long id);
    Title saveTitle(Title title);
    Title updateTitle(Title title);
    void deleteTitle(Long id);

}
