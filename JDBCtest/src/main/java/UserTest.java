import Bean.User;
import Controller.UserService;

public class UserTest {
    public static void main(String[] args) {
        User user =new User("张三","zhangsan",18);
        UserService us = new UserService();
        us.registUser(user);
        if(us.loginUser("张三","zhangsan")){
            System.out.println("已登录");
        }else{
            System.out.println("登陆失败");
        }
    }
}
