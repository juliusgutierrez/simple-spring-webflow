package ph.com.usegutierrez.simplespringwebflow.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * Created by juliusgutierrez on 3/25/22.
 */

@Data
@Entity
@Table(name = "billing")
public class Billing implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @NotBlank(message = "Please enter your billing address")
  private String address;

}
