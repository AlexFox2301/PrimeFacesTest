package beans;

import dao.UserDAO;
import tables.User;

import javax.ejb.EJB;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class UserBean implements Serializable{
    @EJB
    UserDAO userDAO;

    public List<User> getUsers(){
        return userDAO.findAll();
    }
}
