package ph.com.usegutierrez.simplespringwebflow.dto;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * Created by juliusgutierrez on 3/23/22.
 */
public class User implements Serializable {


  @NotBlank
  private String firstName;

  @NotBlank
  private String lastName;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
}
