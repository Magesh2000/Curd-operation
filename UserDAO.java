
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sep.management.entity.UserEntity;
import com.sep.management.repository.UserRepository;
import com.sep.management.vo.UserVO;

@Repository
public class UserDAO {

	@Autowired
	private EntityManager entityManager;

	@Autowired
	private UserRepository userMasterRepository;

	public List<UserEntity> getUserList(UserVO user) {

		return userMasterRepository.findAll();
	}

	public void createUser(UserEntity userMasterVo) {
		userMasterRepository.save(userMasterVo);
	}

	public Optional<UserEntity> findById(Integer userId) {

		return userMasterRepository.findById(userId);
	}


}
