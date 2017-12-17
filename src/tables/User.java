package tables;

import javax.persistence.*;

@Entity
public class User {
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    @Basic
    private String login;

    @Basic
    private String password;

    @Basic
    private String realname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }
}
