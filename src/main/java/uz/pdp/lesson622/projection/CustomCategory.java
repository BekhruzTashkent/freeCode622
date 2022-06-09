package uz.pdp.lesson622.projection;


import org.springframework.data.rest.core.config.Projection;
import uz.pdp.lesson622.entity.Attachment;

@Projection(types = Attachment.class)
public interface CustomCategory {

   Integer getId();
   String getName();
   String getParentCategory();

}
