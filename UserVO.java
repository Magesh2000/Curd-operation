
import java.io.Serializable;
import java.util.List;

public class UserVO implements Serializable {
	
	private static final long serialVersionUID = -5152152643662530795L;

	private Integer userId;
	
	private String userLoginId;
	
	private String password;
	
	private Integer organizationId;
	
	private Integer[] deleteItem;
	
	private Integer active;
	
	private String firstName;
	
	private String status;
	
	private String middleName;
	
	private String lastName;	
	
	private String emailId;
	
	private String phoneNumber;
	
	private Integer roleId;
	
	private String roleName;
	
	private String userLn;
	
	private String imagePath;
	
	private Integer firstLogin;
	
	private List<UserVO> userVoList;

	private List<UserVO> userList;
	
	private String address;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserLoginId() {
		return userLoginId;
	}

	public void setUserLoginId(String userLoginId) {
		this.userLoginId = userLoginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(Integer organizationId) {
		this.organizationId = organizationId;
	}

	public Integer[] getDeleteItem() {
		return deleteItem;
	}

	public void setDeleteItem(Integer[] deleteItem) {
		this.deleteItem = deleteItem;
	}

	public Integer getActive() {
		return active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}


	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getUserLn() {
		return userLn;
	}

	public void setUserLn(String userLn) {
		this.userLn = userLn;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public Integer getFirstLogin() {
		return firstLogin;
	}

	public void setFirstLogin(Integer firstLogin) {
		this.firstLogin = firstLogin;
	}

	public List<UserVO> getUserVoList() {
		return userVoList;
	}

	public void setUserVoList(List<UserVO> userVoList) {
		this.userVoList = userVoList;
	}

	public List<UserVO> getUserList() {
		return userList;
	}

	public void setUserList(List<UserVO> userList) {
		this.userList = userList;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	} 
}
