package ph.com.usegutierrez.simplespringwebflow.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * Created by juliusgutierrez on 3/23/22.
 */

@Data
@Entity
@Table(name = "user")
public class User implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @NotBlank(message = "Please enter first name!")
  private String firstName;

  @NotBlank(message = "Please enter last name")
  private String lastName;

}
