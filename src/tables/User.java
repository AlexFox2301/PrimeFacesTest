package tables;

import javax.persistence.*;
import java.util.Date;

@Entity
public class User {
    
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    @Basic
    private String foto;
    @Basic
    private String lastName;
    @Basic
    private String firstName;
    @Basic
    private String fatherName;
    @Basic
    private String position;
    @Basic
    private String address;             //Адрес
    @Basic
    private String phoneNumber;         //Номер телефона
    @Basic
    private String e_mail;               //Электронный почтовый ящик
    @Basic
    private String login;
    @Basic
    private String password;
    @Basic
    private Date dateAdmissiom;         //Дата приёма
    @Basic
    private Date dateOfDismissal;       //Дата увольнения

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

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

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public Date getDateAdmissiom() {
        return dateAdmissiom;
    }

    public void setDateAdmissiom(Date dateAdmissiom) {
        this.dateAdmissiom = dateAdmissiom;
    }

    public Date getDateOfDismissal() {
        return dateOfDismissal;
    }

    public void setDateOfDismissal(Date dateOfDismissal) {
        this.dateOfDismissal = dateOfDismissal;
    }
}
