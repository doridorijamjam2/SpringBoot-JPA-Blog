package kr.or.shi.interface03.web.userinfo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import kr.or.shi.interface03.domain.userinfo.UserInfo;
import kr.or.shi.interface03.domain.userinfo.dao.UserInfoDao;
import kr.or.shi.interface03.domain.userinfo.dao.MsSql.UserInfoMssqlDao;
import kr.or.shi.interface03.domain.userinfo.dao.MySql.UserInfoMySqlDao;
import kr.or.shi.interface03.domain.userinfo.dao.Oracle.UserInfoOracleDao;

public class UserInfoClient {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fStream = new FileInputStream("db.properties");
		
		Properties properties = new Properties();
		properties.load(fStream);
		
		String dbType = properties.getProperty("DBTYPE");
		
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId("sct");
		userInfo.setPassword("1234");
		userInfo.setUserName("LEE");
		
		UserInfoDao userInfoDao = null;
		
		if(dbType.equals("MYSQL")) {
			userInfoDao = new UserInfoMySqlDao();
		}
		else if(dbType.equals("ORACLE")) {
			userInfoDao = new UserInfoOracleDao();
		}
		else if(dbType.equals("MSSQL")) {
			userInfoDao = new UserInfoMssqlDao();
		}
		else {
			System.out.println("db error");
			return;
		}
		
		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);
		
	}

}
