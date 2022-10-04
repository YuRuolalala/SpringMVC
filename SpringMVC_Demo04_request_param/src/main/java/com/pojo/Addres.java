package com.pojo;

public class Addres {
    private String addr;
    private String prov;

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getProv() {
        return prov;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }

    @Override
    public String toString() {
        return "Addres{" +
                "addr='" + addr + '\'' +
                ", prov='" + prov + '\'' +
                '}';
    }
}
