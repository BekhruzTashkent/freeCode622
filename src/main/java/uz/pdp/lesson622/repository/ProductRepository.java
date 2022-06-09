package uz.pdp.lesson622.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.lesson622.entity.Attachment;
import uz.pdp.lesson622.entity.Product;
import uz.pdp.lesson622.projection.CustomProduct;

@RepositoryRestResource(path = "product",collectionResourceRel = "list", excerptProjection = CustomProduct.class)
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
