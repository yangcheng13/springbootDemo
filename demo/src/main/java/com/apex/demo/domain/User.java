/*
 * Copyright @ 2018 com.apexsoft demo 下午2:40:49 All right reserved.
 */
package com.apex.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @desc: demo
 * @author: yangcheng
 * @createTime: 2018年5月2日 下午2:40:49
 * @version: v1.0
 */
@Entity(name = "tb_user")
public class User {

    @SuppressWarnings("unused")
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false, unique = true)
    private String userName;
    @Column(nullable = false)
    private String passWord;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = true, unique = true)
    private String nickName;
    @Column(nullable = false)
    private String regTime;

    /**
     * constructor of User.java
     */
    public User(String userName, String email, String nickName, String passWord,
            String regTime) {
        this.email = email;
        this.userName = userName;
        this.nickName = nickName;
        this.passWord = passWord;
        this.regTime = regTime;

    }
    
    public User()
    {
        
    }

    /**
     * @return the id
     */

    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the userName
     */

    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the passWord
     */

    public String getPassWord() {
        return passWord;
    }

    /**
     * @param passWord the passWord to set
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    /**
     * @return the email
     */

    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the nickName
     */

    public String getNickName() {
        return nickName;
    }

    /**
     * @param nickName the nickName to set
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * @return the regTime
     */

    public String getRegTime() {
        return regTime;
    }

    /**
     * @param regTime the regTime to set
     */
    public void setRegTime(String regTime) {
        this.regTime = regTime;
    }


}

