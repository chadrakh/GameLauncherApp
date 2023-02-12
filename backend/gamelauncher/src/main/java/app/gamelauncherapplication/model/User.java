package app.gamelauncherapplication.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Table("USERS")
public class User {
    @Id
    private Integer id;

    private String firstName;

    private String lastName;

    private String fullName;

    @NotEmpty
    @Email
    private String email;

    @NotEmpty
    private String password;

    public User(){}

    public User(String _firstName, String _lastName, String _email, String _password) {
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.fullName = firstName + lastName;
        this.email = _email;
        this.password = _password;
    }

    public Integer getId() { return id; }
    public void setId(Integer _id) {this.id = _id; }

    public String getFirstName() { return firstName; }

    public String getLastName() { return lastName; }

    public String getFullName() { return fullName; }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
