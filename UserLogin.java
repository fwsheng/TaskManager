/**
 * ClassName: UserLogin
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author: 废物盛
 * @Create: 2024/5/22 - 20:53
 * @Version: v1.0
 */
public class UserLogin {
    private UserRegistration userRegistration;

    public UserLogin(UserRegistration userRegistration) {
        this.userRegistration = userRegistration;
    }

    public boolean login(String username, String password) {
        return userRegistration.login(username, password);
    }

}