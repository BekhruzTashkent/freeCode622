package uz.pdp.lesson622.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.lesson622.entity.Attachment;
import uz.pdp.lesson622.entity.Attachment_Content;
import uz.pdp.lesson622.projection.CustomAttachment;
import uz.pdp.lesson622.projection.CustomAttachmentContent;

@RepositoryRestResource(path = "attachmentContent",collectionResourceRel = "list", excerptProjection = CustomAttachmentContent.class)
public interface AttachmentContentRepository extends JpaRepository<Attachment_Content, Integer> {
}
