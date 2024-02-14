package bibliosio.emprunteur;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository

public interface EmprunteurRepository extends JpaRepository<Emprunteur, Long> {

}
