package uz.pdp.lesson622.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.lesson622.entity.Attachment;
import uz.pdp.lesson622.entity.Customer;
import uz.pdp.lesson622.projection.CustomCustomer;

@RepositoryRestResource(path = "customer",collectionResourceRel = "list", excerptProjection = CustomCustomer.class)
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
