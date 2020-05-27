import com.li.dao.UserDaoMysqlImpl;
import com.li.dao.UserDaoOracleImpl;
import com.li.service.UserService;
import com.li.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    public static void main(String[] args) {
//        //用户实际调用的是业务层，dao层不需要接触
//        UserServiceImpl userService = new UserServiceImpl();
//
//        userService.setUserDao(new UserDaoOracleImpl());
//
//        userService.getUser();

        //获取ApplicationContext;拿到Spring的容器
       ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
       //容器在手，天下我有，需要什么，就直接get什么
       UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("userServiceImpl");

       userServiceImpl.getUser();
    }
}
