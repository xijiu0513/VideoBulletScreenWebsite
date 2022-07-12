package com.wyk.pojo;

public class User {
    private Integer userId;

    private String userAccount;

    private String userPassword;

    private String userNickname;

    private String userEmail;

    private Integer userType;

    private String userProfilepic;

    private String userAboutself;

    private String userTypeName;

    public String getUserTypeName() {
        return userType == 0 ? "管理员" : "用户等级 LV" + userType;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname == null ? null : userNickname.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getUserProfilepic() {
        return userProfilepic;
    }

    public void setUserProfilepic(String userProfilepic) {
        this.userProfilepic = userProfilepic == null ? null : userProfilepic.trim();
    }

    public String getUserAboutself() {
        return userAboutself;
    }

    public void setUserAboutself(String userAboutself) {
        this.userAboutself = userAboutself == null ? null : userAboutself.trim();
    }
}
