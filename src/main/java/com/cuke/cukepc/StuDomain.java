package com.cuke.cukepc;

import java.io.Serializable;

/**
 * Created by wangjw on 2017/5/18 0018.
 */
public class StuDomain implements Serializable{

    private Integer age;
    private String name;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
