package ph.com.usegutierrez.simplespringwebflow.dto;

import java.io.Serializable;

/**
 * Created by juliusgutierrez on 3/25/22.
 */
public class RegisterModel implements Serializable {

  private User user;
  private Billing billing;

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Billing getBilling() {
    return billing;
  }

  public void setBilling(Billing billing) {
    this.billing = billing;
  }
}
