package Final_Pro.example.BackEnd.Repository;

import Final_Pro.example.BackEnd.Entity.Musical;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface MusicalRepository extends JpaRepository<Musical,Integer> {

}
