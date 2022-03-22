package ph.com.usegutierrez.simplespringwebflow.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignUpController {


  @GetMapping("/")
  public String getSignUpPage(Model model) {
    return "signup";
  }

}
