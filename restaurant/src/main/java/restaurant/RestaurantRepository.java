package restaurant;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface RestaurantRepository extends PagingAndSortingRepository<Restaurant, Long>{

 List<Restaurant> findByreservationNo(Long reservationNo);
  
}
