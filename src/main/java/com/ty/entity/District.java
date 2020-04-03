package com.ty.entity;

/**
 * <p>
 * 
 * </p>
 *
 * @author YangJinChuan
 * @since 2020-04-01
 */
public class District{


    private Integer id;
    private String name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "District{" +
        ", id=" + id +
        ", name=" + name +
        "}";
    }
}
