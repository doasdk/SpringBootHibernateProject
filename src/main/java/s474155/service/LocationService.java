package s474155.service;


import s474155.model.Employee;
import s474155.model.Location;

import java.util.List;
import java.util.Optional;

public interface LocationService {

    List<Location> findAllLocations();
    Optional<Location> findById(Long id);
    Location saveLocation(Location location);
    Location updateLocation (Location location);
    void deleteLocation(Long id);

}
