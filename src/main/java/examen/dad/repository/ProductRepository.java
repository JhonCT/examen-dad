package examen.dad.repository;

import examen.dad.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    
    @Query(value = "select * from products where code = ?1", nativeQuery = true)
    Product findProductByCode(String code);
}
