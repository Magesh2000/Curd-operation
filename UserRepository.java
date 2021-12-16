
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sep.management.entity.UserEntity;

/**
 * This interface is used to access database and get result
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
	
}
