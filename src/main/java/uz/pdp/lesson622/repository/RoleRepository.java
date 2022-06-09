package uz.pdp.lesson622.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.lesson622.entity.Attachment;
import uz.pdp.lesson622.entity.Role;
import uz.pdp.lesson622.projection.CustomRole;

@RepositoryRestResource(path = "role",collectionResourceRel = "list", excerptProjection = CustomRole.class)
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
