package com.vti.vn.object;

/**
 * @created: 26/10/2023 - 8:43 PM
 * @author: dungna
 */
public class Student extends Person {
    private int age;
    private String className;

    // Contructor
    public Student() {
    }

    // Contructor sử dụng từ khóa super để tham chiếu đến các thành phần của class cha
    public Student(String name, String address) {
        super(name, address);
    }

    // end contructor

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override  // annotation
    public int tinhDienTichHinhVuong(int a, int b) {
        int c = a*b + 898;
        return c;
    }
}
