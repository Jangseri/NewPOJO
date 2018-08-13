package com.example.seri.newpojo;

public class DataModel {

    private String pname;
    private String sname;

    public DataModel(String pname, String sname){
        this.pname = pname;
        this.sname = sname;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }


}
