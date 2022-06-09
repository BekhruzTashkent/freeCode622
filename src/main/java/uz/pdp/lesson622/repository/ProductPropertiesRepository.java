package uz.pdp.lesson622.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.lesson622.entity.Attachment;
import uz.pdp.lesson622.entity.Product_Properties;
import uz.pdp.lesson622.projection.CustomProductProperties;

@RepositoryRestResource(path = "productProperties",collectionResourceRel = "list", excerptProjection = CustomProductProperties.class)
public interface ProductPropertiesRepository extends JpaRepository<Product_Properties, Integer> {
}
