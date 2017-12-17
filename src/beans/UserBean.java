package beans;

import dao.UserDAO;
import tables.User;

import javax.ejb.EJB;
import java.io.Serializable;
import java.util.List;

public class UserBean implements Serializable{
    @EJB
    UserDAO userDAO;

    public List<User> getUsers(){
        return userDAO.findAll();
    }
}
