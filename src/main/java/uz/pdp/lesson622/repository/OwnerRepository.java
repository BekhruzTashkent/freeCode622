package uz.pdp.lesson622.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.lesson622.entity.Attachment;
import uz.pdp.lesson622.entity.Owner;
import uz.pdp.lesson622.projection.CustomOwner;

@RepositoryRestResource(path = "owner",collectionResourceRel = "list", excerptProjection = CustomOwner.class)
public interface OwnerRepository extends JpaRepository<Owner, Integer> {
}
