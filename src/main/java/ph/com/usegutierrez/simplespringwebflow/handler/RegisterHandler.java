package ph.com.usegutierrez.simplespringwebflow.handler;

import org.springframework.stereotype.Component;
import ph.com.usegutierrez.simplespringwebflow.dto.Billing;
import ph.com.usegutierrez.simplespringwebflow.dto.RegisterModel;
import ph.com.usegutierrez.simplespringwebflow.dto.User;


/**
 * Created by juliusgutierrez on 3/25/22.
 */

@Component
public class RegisterHandler {


  public RegisterModel init() {
    return new RegisterModel();
  }


  public void addUser(RegisterModel registerModel, User user) {
    registerModel.setUser(user);
  }


  public void addBilling(RegisterModel registerModel, Billing billing) {
    registerModel.setBilling(billing);
  }

  public String save(RegisterModel model) {

    String transitionValue = "success";


    return transitionValue;

  }
}
