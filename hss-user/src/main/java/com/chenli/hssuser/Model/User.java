package com.chenli.hssuser.Model;

import com.chenli.hssEurekaServer.model.BaseModel;

import java.util.ArrayList;
import java.util.List;

public class User extends BaseModel {
    private String id;
    private String username;
    private String password;
    private String salt = "bug";
    private String realName;
    private String tel;
    private String email;
    // 对应的角色
    private Integer roleId;
    // 对应用户绑定的微信号
    private String fromUserName;
    // 员工和角色多对多
    private List<Role> roles = new ArrayList<Role>();

//    // 处理中间表保存
//    public List<Map<String, Long>> getRoleMap() {
//        List<Map<String, Long>> list = new ArrayList<Map<String, Long>>();
//        if (getRoles().size() > 0) {
//            for (Role role : getRoles()) {
//                Map<String, Long> map = new HashMap<String, Long>();
//                map.put("userId", getId());
//                map.put("roleId", role.getId());
//                list.add(map);
//            }
//        }
//        return list;
//    }

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

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getFromUserName() {
        return fromUserName;
    }

    public void setFromUserName(String fromUserName) {
        this.fromUserName = fromUserName;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
