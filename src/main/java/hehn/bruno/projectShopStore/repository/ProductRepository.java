package hehn.bruno.projectShopStore.repository;

import hehn.bruno.projectShopStore.model.ProductEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProductRepository extends CrudRepository<ProductEntity, Long> {
}
