package kr.or.shi.interface03.domain.userinfo.dao.Oracle;

import kr.or.shi.interface03.domain.userinfo.UserInfo;
import kr.or.shi.interface03.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("Insert into DB userID = " + userInfo.getUserId());
		
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("Update into DB userID = " + userInfo.getUserId());
		
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("Delete into DB userID = " + userInfo.getUserId());
		
	}

}
