package examen.dad.repository;

import examen.dad.model.Details_Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailsSaleRepository extends JpaRepository<Details_Sale, Long> {
}
