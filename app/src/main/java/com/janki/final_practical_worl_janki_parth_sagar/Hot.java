package com.janki.final_practical_worl_janki_parth_sagar;

public class Hot {
    private int id;
    private String name;
    private String desc;
    private int imgResourceId;

    public Hot(int id,int imgResourceId, String name, String desc){
        this.setId(id);
        this.setImgResourceId(imgResourceId);
        this.setName(name);
        this.setDesc(desc);
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImgResourceId() {
        return imgResourceId;
    }

    public void setImgResourceId(int imgResourceId) {
        this.imgResourceId = imgResourceId;
    }


}
