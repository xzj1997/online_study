package cn.cqgcxy.domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import	java.io.Serializable;

/**
 * 用户的实体类
 */
@Entity
public class User implements Serializable {
    //序列化id
    private static final long serialVersionUID = 45L;
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;//主键id
    //用户名
    private String name;
    //用户密码
    private String password;
    //用户类型
    private String type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
