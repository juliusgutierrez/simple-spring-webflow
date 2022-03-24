package ph.com.usegutierrez.simplespringwebflow.dto;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * Created by juliusgutierrez on 3/25/22.
 */
public class Billing implements Serializable {

  @NotBlank
  private String address;

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
}
