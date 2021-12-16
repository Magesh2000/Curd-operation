

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sep.management.common.constants.ApiConstant;
import com.sep.management.service.UserService;
import com.sep.management.vo.JSONResponse;
import com.sep.management.vo.UserVO;

/**
 * Class used to list,create,update,delete and search user details
 *@author magesh
 */
@Controller
@RequestMapping(ApiConstant.REQUEST_MAPPING_PATH)
public class UserController {

	@Autowired
	private UserService userMasterService;

	@PostMapping(value = ApiConstant.USER_LIST)
	public ResponseEntity<JSONResponse> getAllUserList(@RequestBody UserVO userVo) {

		JSONResponse jsonResponse = new JSONResponse();

		UserVO userMasterVo = userMasterService.getAllUserList(userVo);

		jsonResponse.setResponseCode("200");
		jsonResponse.setSuccesObject(userMasterVo);

		return new ResponseEntity<>(jsonResponse, HttpStatus.OK);

	}
	
	
	@PostMapping(value = ApiConstant.USER_SAVE)
	public ResponseEntity<JSONResponse> createUser(@RequestBody UserVO userVo) throws Exception {

		JSONResponse jsonResponse = new JSONResponse();

		UserVO userMasterVo = userMasterService.createUser(userVo);

		jsonResponse.setResponseCode("200");
		jsonResponse.setSuccesObject(userMasterVo);

		return new ResponseEntity<>(jsonResponse, HttpStatus.OK);

	}

}
