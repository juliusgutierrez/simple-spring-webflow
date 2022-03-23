package ph.com.usegutierrez.simplespringwebflow.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * Created by juliusgutierrez on 3/23/22.
 */
@Getter
@Setter
public class PersonalInfo implements Serializable {


  @NotBlank
  private String username;

  @NotBlank
  private String password;




}
