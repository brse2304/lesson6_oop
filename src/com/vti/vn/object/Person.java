package com.vti.vn.object;

/**
 * @created: 26/10/2023 - 7:57 PM
 * @author: dungna
 */
public class Person {

    private String name;
    private String address;

    public Person() {
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // tạo 1 hàm để hàm con override lại
    public int tinhDienTichHinhVuong(int a, int b) {
        int c = a*b;
        return c;
    }
}
