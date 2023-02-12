package s474155.controller;

import org.springframework.web.bind.annotation.*;
import s474155.model.Title;
import s474155.service.TitleService;

import java.util.List;
import java.util.Optional;

@RestController
public class TitleController {

    private final TitleService titleService;

    public TitleController(TitleService titleService) {
        this.titleService = titleService;
    }

    @GetMapping("/titles")
    public List<Title> findAllTitles(){
        return titleService.findAllTitles();
    }

    @GetMapping("/titles/{id}")
    public Optional<Title> findTitleById(@PathVariable("id") Long id){
        return titleService.findById(id);
    }

    @PostMapping("/titles")
    public Title saveTitle(@RequestBody Title title){
        return titleService.saveTitle(title);
    }

    @PutMapping("/titles")
    public Title updateTitle(@RequestBody Title title){
        return titleService.updateTitle(title);
    }

    @DeleteMapping("/titles/{id}")
    public void deleteTitle(@PathVariable("id")Long id){
        titleService.deleteTitle(id);
    }


}
