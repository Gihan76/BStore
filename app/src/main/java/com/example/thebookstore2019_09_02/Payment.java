package com.example.thebookstore2019_09_02;

public class Payment {
    private String username;
    private String email;
    private String addres;
    private Integer phone;
    private Integer code;
    private boolean cdtype;
    private Integer accnum;
    private String city;

    public Payment() {
    }


    public boolean isCdtype() {
        return cdtype;
    }

    public void setCdtype(boolean cdtype) {
        this.cdtype = cdtype;
    }

    public Integer getAccnum() {
        return accnum;
    }

    public void setAccnum(Integer accnum) {
        this.accnum = accnum;
    }



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }




}

