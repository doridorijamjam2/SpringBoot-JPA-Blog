
package kr.or.shi.interface03.domain.userinfo.dao;


import kr.or.shi.interface03.domain.userinfo.UserInfo;

public interface UserInfoDao {
	
	void insertUserInfo(UserInfo userInfo);
	void updateUserInfo(UserInfo userInfo);
	void deleteUserInfo(UserInfo userInfo);

}

