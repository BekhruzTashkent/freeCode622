package uz.pdp.lesson622.projection;


import org.springframework.data.rest.core.config.Projection;
import uz.pdp.lesson622.entity.Attachment;

@Projection(types = Attachment.class)
public interface CustomCustomer {

   Integer getId();
   String getFullName();
   String getPhoneNumber();
   String getEmail();

}
