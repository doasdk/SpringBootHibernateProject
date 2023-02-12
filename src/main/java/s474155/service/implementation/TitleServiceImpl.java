package s474155.service.implementation;

import org.springframework.stereotype.Service;
import s474155.model.Title;
import s474155.repository.TitleRepository;
import s474155.service.TitleService;

import java.util.List;
import java.util.Optional;

@Service
public class TitleServiceImpl implements TitleService {

    private final TitleRepository titleRepository;

    public TitleServiceImpl(TitleRepository titleRepository) {
        this.titleRepository = titleRepository;
    }


    @Override
    public List<Title> findAllTitles() {
        return titleRepository.findAll();
    }

    @Override
    public Optional<Title> findById(Long id) {
        return titleRepository.findById(id);
    }

    @Override
    public Title saveTitle(Title title) {
        return titleRepository.save(title);
    }

    @Override
    public Title updateTitle(Title title) {
        return titleRepository.save(title);
    }

    @Override
    public void deleteTitle(Long id) {
        titleRepository.deleteById(id);
    }
}
