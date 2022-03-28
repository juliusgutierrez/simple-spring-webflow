package ph.com.usegutierrez.simplespringwebflow.handler;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ph.com.usegutierrez.simplespringwebflow.dao.UserRepository;
import ph.com.usegutierrez.simplespringwebflow.entity.Billing;
import ph.com.usegutierrez.simplespringwebflow.dto.RegisterModel;
import ph.com.usegutierrez.simplespringwebflow.entity.User;


/**
 * Created by juliusgutierrez on 3/25/22.
 */


@RequiredArgsConstructor
@Component
public class RegisterHandler {

  private final UserRepository userRepository;


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

    userRepository.save(model.getUser());

    return transitionValue;

  }
}
