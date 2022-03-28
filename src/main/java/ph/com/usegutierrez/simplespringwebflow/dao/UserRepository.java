package ph.com.usegutierrez.simplespringwebflow.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ph.com.usegutierrez.simplespringwebflow.entity.User;

/**
 * Created by juliusgutierrez on 3/28/22.
 */
public interface UserRepository extends JpaRepository<User, Integer> {

}
