package s474155.controller;

import org.springframework.web.bind.annotation.*;
import s474155.model.Location;
import s474155.model.Title;
import s474155.service.LocationService;

import java.util.List;
import java.util.Optional;

@RestController
public class LocationController {

    private final LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping("/locations")
    public List<Location> findAllTitles(){
        return locationService.findAllLocations();
    }

    @GetMapping("/locations/{id}")
    public Optional<Location> findLocationById(@PathVariable("id") Long id){
        return locationService.findById(id);
    }

    @PostMapping("/locations")
    public Location saveLocation(@RequestBody Location location){
        return locationService.saveLocation(location);
    }

    @PutMapping("/locations")
    public Location updateLocation(@RequestBody Location location){
        return locationService.updateLocation(location);
    }

    @DeleteMapping("/locations/{id}")
    public void deleteLocation(@PathVariable("id")Long id){
        locationService.deleteLocation(id);
    }



}
