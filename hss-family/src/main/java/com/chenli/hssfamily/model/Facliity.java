package com.chenli.hssfamily.model;

import com.chenli.hssEurekaServer.model.BaseModel;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class Facliity extends BaseModel {
    @Getter@Setter private String manufacturer;
    @Getter@Setter private Date productionTime;
    @Getter@Setter private Date bindingnTime;
    @Getter@Setter private Integer status;
    @Getter@Setter private String location;
}
