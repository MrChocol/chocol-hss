package com.chenli.hssEurekaServer.model;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class BaseModel {
    @Getter@Setter protected Long id;
    @Getter@Setter protected String name;

    @Override
    public String toString() {
        // 需要排除某些字段（关联对象）， 可以使用ReflectionToStringBuilder.toStringExclude方法。
        String[] excludes = {};
        // 使用ToStringStyle.SHORT_PREFIX_STYLE 截掉包名
        ReflectionToStringBuilder.setDefaultStyle(ToStringStyle.SHORT_PREFIX_STYLE);
        return ReflectionToStringBuilder.toStringExclude(this, excludes);
    }

}
