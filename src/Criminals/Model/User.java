package Criminals.Model;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String name;

    private String cpf;

    private String birth;

    private String office;

    private String login;

    private String password;

    private String level;


    public User(String name, String cpf, String birth, String office) {
        this.name = name;
        this.cpf = cpf;
        this.birth = birth;
        this.office = office;
        this.login = login;
        this.password = password;
    }

    public User() {
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) { this.office = office; }

    public String getLogin() { return login; }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword (){ return password; }

    public void setPassword(String password) { this.password = password; }
}
