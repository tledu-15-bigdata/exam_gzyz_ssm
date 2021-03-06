package gzyz.Allmode.pojo;

public class User {
    private int userRole;
    private String userId;
    private String userImg;
    private String userPhone;
    private String userName;
    private String userPwd;
    private int isDelete;
    private String createTime;

    public User() {
    }

    public User(int userRole, String userId, String userImg, String userPhone, String userName, String userPwd, int isDelete, String createTime) {
        this.userRole = userRole;
        this.userId = userId;
        this.userImg = userImg;
        this.userPhone = userPhone;
        this.userName = userName;
        this.userPwd = userPwd;
        this.isDelete = isDelete;
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "userRole=" + userRole +
                ", userId='" + userId + '\'' +
                ", userImg='" + userImg + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userName='" + userName + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", isDelete=" + isDelete +
                ", createTime='" + createTime + '\'' +
                '}';
    }

    public int getUserRole() {
        return userRole;
    }

    public void setUserRole(int userRole) {
        this.userRole = userRole;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
