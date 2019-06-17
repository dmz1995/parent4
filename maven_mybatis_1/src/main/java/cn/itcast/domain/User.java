package cn.itcast.domain;

import java.util.Date;

public class User {
    private int id      ; // int(11)      (NULL)           NO      PRI     (NULL)   auto_increment  select,insert,update,references
    private String username; // varchar(50)  utf8_general_ci  YES             (NULL)                   select,insert,update,references
    private String password; // varchar(50)  utf8_general_ci  YES             (NULL)                   select,insert,update,references
    private Date birthday;
    public User() {
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public User(Date birthday) {
        this.birthday = birthday;
    }

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
