package com.darkneees.discordfrontanalitycs.Entity;

public class ChannelEntity {

    private String name;
    private String id;

    public ChannelEntity() {
    }

    public ChannelEntity(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
