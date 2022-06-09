package uz.pdp.lesson622.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.lesson622.entity.Attachment;
import uz.pdp.lesson622.entity.Payment_Customer;
import uz.pdp.lesson622.projection.CustomPaymentCustomer;

@RepositoryRestResource(path = "paymentCustomer",collectionResourceRel = "list", excerptProjection = CustomPaymentCustomer.class)
public interface PaymentCustomerRepository extends JpaRepository<Payment_Customer, Integer> {
}
