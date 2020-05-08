package hehn.bruno.projectShopStore.repository;


import hehn.bruno.projectShopStore.model.ClientEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ClientRepository extends CrudRepository<ClientEntity, Long> {

}
