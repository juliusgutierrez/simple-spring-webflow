package ph.com.usegutierrez.simplespringwebflow.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by juliusgutierrez on 3/23/22.
 */

@Controller
public class IndexController {

  @GetMapping("/")
  public String getSignUpPage() {
    return "index";
  }

}
