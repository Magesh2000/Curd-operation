
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.sep.management.dao.UserDAO;
import com.sep.management.entity.UserEntity;
import com.sep.management.util.MailSenderUtil;
import com.sep.management.vo.UserVO;
import com.sep.management.vo.UserVO;

/**
 * 
 * Class used to list,create,update,delete and search user details
 * 
 * @author magesh
 *
 */
@Component
public class UserService {

	@Autowired
	private UserDAO userMasterDAO;

	@Autowired
	private MailSenderUtil mailSender;

	@Transactional
	public UserVO getAllUserList(UserVO user) {

		UserVO userVO = new UserVO();

		List<UserVO> userVoList = new ArrayList<>();

		List<UserEntity> userlist = userMasterDAO.getUserList(user);

		if (userlist != null && !userlist.isEmpty()) {
			userVoList = copyUserObjectToUserVo(userlist);
		}

		if (userVoList != null && !userVoList.isEmpty()) {
			userVO.setUserVoList(userVoList);
		}
		return userVO;

	}

	/**
	 * Method is used to Get all list the user details.
	 * 
	 * @param userList List<Object[]>
	 * @return userMasterVoList List<UserMasterVo>
	 */
	public List<UserVO> copyUserObjectToUserVo(List<UserEntity> userList) {

		List<UserVO> userMasterVoList = new ArrayList<>();
		UserVO userMasterVo = new UserVO();
		for (UserEntity userEntity : userList) {

			if (userEntity.getActiveFlag() == 1) {
				userMasterVo = new UserVO();

				if (null != userEntity.getUserId()) {
					userMasterVo.setUserId(userEntity.getUserId());
				}
				if (null != userEntity.getUserLoginId()) {
					userMasterVo.setUserLoginId(userEntity.getUserLoginId());
				}

				if (null != userEntity.getFirstName()) {
					userMasterVo.setFirstName(userEntity.getFirstName());
				}

				if (null != userEntity.getPhoneNumber()) {
					userMasterVo.setMiddleName(userEntity.getMiddleName());
				}

				if (null != userEntity.getPhoneNumber()) {
					userMasterVo.setLastName(userEntity.getLastName());
				}

				if (null != userEntity.getPhoneNumber()) {
					userMasterVo.setEmailId(userEntity.getEmailId());
				}

				if (null != userEntity.getPhoneNumber()) {
					userMasterVo.setPhoneNumber(userEntity.getPhoneNumber());
				}

				if (null != userEntity.getAddress()) {
					userMasterVo.setAddress(userEntity.getAddress());
				}

				userMasterVoList.add(userMasterVo);
			}
		}
		return userMasterVoList;
	}

	public UserVO createUser(UserVO userEntity) throws Exception {
		UserEntity userMasterVo = new UserEntity();

		if (null != userEntity.getUserId()) {
			Optional<UserEntity> pres = userMasterDAO.findById(userEntity.getUserId());
			if (pres.isPresent()) {
				userMasterVo = pres.get();
			}

		}

		if (null != userEntity.getUserId()) {
			userMasterVo.setUserId(userEntity.getUserId());
		}
		if (null != userEntity.getUserLoginId()) {
			userMasterVo.setUserLoginId(userEntity.getUserLoginId());
		}

		if (null != userEntity.getFirstName()) {
			userMasterVo.setFirstName(userEntity.getFirstName());
		}

		if (null != userEntity.getPhoneNumber()) {
			userMasterVo.setMiddleName(userEntity.getMiddleName());
		}

		if (null != userEntity.getPhoneNumber()) {
			userMasterVo.setLastName(userEntity.getLastName());
		}

		if (null != userEntity.getPhoneNumber()) {
			userMasterVo.setEmailId(userEntity.getEmailId());
		}

		if (null != userEntity.getPhoneNumber()) {
			userMasterVo.setPhoneNumber(userEntity.getPhoneNumber());
		}

		if (null != userEntity.getAddress()) {
			userMasterVo.setAddress(userEntity.getAddress());
		}

		if (null != userEntity.getRoleId()) {
			userMasterVo.setRoleId(userEntity.getRoleId());
		}

		userMasterVo.setActiveFlag(userEntity.getActive());

		if (userEntity.getAddress().equals(0)) {
			userMasterVo.setDeleteFlag(true);
		} else {
			userMasterVo.setDeleteFlag(false);
		}
		userMasterVo.setPassword("12345");
		userMasterDAO.createUser(userMasterVo);

		/*
		 * MailVo mailVo = new MailVo();
		 * mailVo.setSubject("Your Account as be created by Second Eye Protection ");
		 * mailVo.setMailTo(new String[] { userEntity.getEmailId() });
		 * mailVo.setMessage("Your new password Sep@12345");
		 * 
		 * if (null != mailVo.getSubject() && null != mailVo.getMailTo() && null !=
		 * mailVo.getMessage()) { // mailSender.sendMail(mailVo);
		 * 
		 * String to = "mageshkrish5@gmail.com"; String from = "mageshkrish7@gmail.com";
		 * String host = "localhost";// or IP address
		 * 
		 * // Get the session object Properties properties = System.getProperties();
		 * properties.setProperty("mail.smtp.host", host); Session session =
		 * Session.getDefaultInstance(properties);
		 * 
		 * // compose the message try { MimeMessage message = new MimeMessage(session);
		 * message.setFrom(new InternetAddress(from));
		 * message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
		 * message.setSubject(mailVo.getSubject());
		 * message.setText(mailVo.getMessage());
		 * 
		 * // Send message Transport.send(message);
		 * System.out.println("message sent successfully....");
		 * 
		 * } catch (MessagingException mex) { mex.printStackTrace(); } }
		 */

		return userEntity;
	}

}
