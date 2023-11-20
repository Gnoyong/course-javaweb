package com.exp;

public class EmployeeBean {
    private String eno = "";
    private String ename = "";
    private String ecompany = "";

    public EmployeeBean() {
    }

    public void setEno(String eno) {
        this.eno = eno;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setEcompany(String ecompany) {
        this.ecompany = ecompany;
    }

    public String getEno() {
        return eno;
    }

    public String getEname() {
        return ename;
    }

    public String getEcompany() {
        return ecompany;
    }
}
