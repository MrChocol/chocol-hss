package com.chenli.hssuser.Model;

import com.chenli.hssEurekaServer.model.BaseModel;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class User extends BaseModel {
    @Getter@Setter private String username;
    @Getter@Setter private String password;
    @Getter@Setter private String salt = "bug";
    @Getter@Setter private String realName;
    @Getter@Setter private String tel;
    @Getter@Setter private String email;
    // 对应的角色
    @Getter@Setter private Integer roleId;
    // 对应用户绑定的微信号
    @Getter@Setter private String fromUserName;
    // 员工和角色多对多
    @Getter@Setter private List<Role> roles = new ArrayList<>();

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
}
