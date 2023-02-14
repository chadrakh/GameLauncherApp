package app.gamelauncherapplication.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Table("USERS")
public class User {
    @Id
    private Integer id;

    private Integer userId;

    private String firstName;

    private String lastName;

    @NotEmpty
    @Email
    private String email;

    @NotEmpty
    private String password;

    public User(){}

    public User(String _firstName, String _lastName, String _email, String _password) {
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.email = _email;
        this.password = _password;
    }

<<<<<<< HEAD
    public Integer getId() {
        return id;
    }
    public void setId(Integer _id) {
        this.id = _id;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String _firstName) {
        this.firstName = _firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String _lastName) {
        this.lastName = _lastName;
    }
=======
    public Integer getUserId() { return userId; }

    public void setUserId(Integer _userId) { this.userId = _userId; }

    public String getFirstName() { return firstName; }
>>>>>>> parent of 68bf353 (updated dto)


    public String getEmail() {
        return email;
    }
    public void setEmail(String _email) {
        this.email = _email;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String _password) {
        this.password = _password;
    }
}