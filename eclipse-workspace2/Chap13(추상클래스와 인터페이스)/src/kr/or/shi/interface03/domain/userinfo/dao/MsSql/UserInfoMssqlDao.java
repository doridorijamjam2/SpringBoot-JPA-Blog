package kr.or.shi.interface03.domain.userinfo.dao.MsSql;

import kr.or.shi.interface03.domain.userinfo.UserInfo;
import kr.or.shi.interface03.domain.userinfo.dao.UserInfoDao;

public class UserInfoMssqlDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("Insert into MSSQL DB userID = " + userInfo.getUserId());
		
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("Update into MSSQL DB userID = " + userInfo.getUserId());
		
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("Delete into MSSQL DB userID = " + userInfo.getUserId());
		
	}

}
