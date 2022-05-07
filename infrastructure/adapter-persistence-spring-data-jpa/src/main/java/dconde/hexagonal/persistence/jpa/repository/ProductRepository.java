package dconde.hexagonal.persistence.jpa.repository;

import dconde.hexagonal.persistence.jpa.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {

    ProductEntity findByProductId(Integer productId);
}
