package com.kg.registration.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Register")
public class Register {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userid")
    private Long userid;

    @Column(name = "userName")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;
    @Column(name="confirmPassword")
     private String confirmpassword;
     /**
      * @return the confirmpassword
      */
     public String getConfirmpassword() {
         return confirmpassword;
     }
     /**
      * @param confirmpassword the confirmpassword to set
      */
     public void setConfirmpassword(String confirmpassword) {
         this.confirmpassword = confirmpassword;
     }
    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}