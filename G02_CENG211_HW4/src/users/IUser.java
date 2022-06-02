package users;

import enums.UserTypes;

/* All user types should use this interface
 * 
 * @author  Serdar Sertg�z  260201030
 * @author  Ertu�rul Demir  260201059
 */

public interface IUser{
	int getUserId();
	void setUserId(int userId);
	String getUserName();
	void setUserName(String userName);
	String getPassword();
	void setPassword(String password);
	String getDisplayedName();
	void setDisplayedName(String displayedName);
	UserTypes getUserType();
	void setUserType(UserTypes userType);
}
