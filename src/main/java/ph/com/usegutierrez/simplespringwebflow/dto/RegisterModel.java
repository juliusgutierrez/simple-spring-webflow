package ph.com.usegutierrez.simplespringwebflow.dto;

import lombok.Data;
import ph.com.usegutierrez.simplespringwebflow.entity.Billing;
import ph.com.usegutierrez.simplespringwebflow.entity.User;

import java.io.Serializable;

/**
 * Created by juliusgutierrez on 3/25/22.
 */
@Data
public class RegisterModel implements Serializable {

  private User user;
  private Billing billing;
}
