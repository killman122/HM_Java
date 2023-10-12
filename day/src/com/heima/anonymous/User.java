package com.heima.anonymous;
/*
        需求:
        1 创建用户(User)对象,对象数据采用键盘录入而来
        2 用户(User)包含的属性:演示部分即可
            用户名,密码,身份证号,姓名,家庭住址,手机号,邮箱
        3 如果登录密码和确认密码不一致,则需要重新输入
        4 将用户对象存储到集合中,并打印集合对象
 */
public class User {
    private String username;
    private String password;
    private String phoneNumber;
    private String confirm;
    private String email;
    private String sex;
    private String birthday;

    public User() {
    }

    public User(String username, String password, String phoneNumber, String confirm, String email, String sex, String birthday) {
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.confirm = confirm;
        this.email = email;
        this.sex = sex;
        this.birthday = birthday;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

}
