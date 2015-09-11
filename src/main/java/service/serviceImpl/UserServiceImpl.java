package service.serviceImpl;

import dao.UserDao;
import model.User;
import service.UserService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * Created by apple on 2015/9/2.
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserDao userDao;

    public User Register(User user) {
        return userDao.Add(user);
    }
}
