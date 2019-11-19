package cn.cqgcxy.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * 用户的实体类
 */
@Entity
@Table(name = "user")
public class User implements Serializable {
    //序列化id
    private static final long serialVersionUID = 45L;

    //主键id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    //用户名
    @Column(name = "user_name")
    private String userName;

    //账号
    @Column(name = "user_number")
    private String userNumber;

    //用户密码
    @Column(name = "user_password")
    private String UserPassword;

    //用户类型
    @Column(name = "user_type")
    private String UserType;

    @ManyToOne
    @JoinColumn(name = "cg_class_id")
    @JsonBackReference
    private CgClass cgClass;

    //一个学生有很多的学习记录
    @OneToMany(mappedBy = "user")
    private Set<StudyRecord> studyRecords = new HashSet<>();

    @Transient
    private String className;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    public String getUserPassword() {
        return UserPassword;
    }

    public void setUserPassword(String userPassword) {
        UserPassword = userPassword;
    }

    public String getUserType() {
        return UserType;
    }

    public void setUserType(String userType) {
        UserType = userType;
    }

    public CgClass getCgClass() {
        return cgClass;
    }

    public void setCgClass(CgClass cgClass) {
        this.cgClass = cgClass;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userNumber='" + userNumber + '\'' +
                ", UserPassword='" + UserPassword + '\'' +
                ", UserType='" + UserType + '\'' +
                ", cgClass=" + cgClass +
                ", className='" + className + '\'' +
                '}';
    }
}
