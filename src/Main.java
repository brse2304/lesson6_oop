import com.vti.vn.object.Person;
import com.vti.vn.object.Student;

import java.util.Date;

/**
 * @created: 26/10/2023 - 7:52 PM
 * @author: dungna
 */
public class Main {
    public static void main(String[] args) {

        // I. Thực hành mảng đối tượng
        // Mảng cơ bản
        int[] mangInt = new int[5];


        Person p1 = new Person("jksfj", "jfsdkjf");
        // Mảng đối tượng
        Person[] listPerson = new Person[3];
        listPerson[0] = new Person("Nguyen Van A", "Japan");
        listPerson[1] = new Person("Nguyen Thi B", "Korea");
        listPerson[2] = new Person("Nguyen Van C", "VietNam");


        System.out.println("Người thứ nhất: " + listPerson[0].getName() + " - " + listPerson[0].getAddress());
        System.out.println("Người thứ hai: " + listPerson[1].getName() + " - " + listPerson[1].getAddress());
        System.out.println("Người thứ ba: " + listPerson[2].getName() + " - " + listPerson[2].getAddress());

        // dùng vòng foreach để in ra các đối tượng trong listPerson
        for (Person item : listPerson) {
            System.out.println("Tên: " + item.getName() + " - Địa chỉ: " + item.getAddress());
        }

        // vòng for cơ bản
        for (int i = 0; i < listPerson.length; i++) {
            //System.out.println("Tên: " + listPerson[i].getName() + " - Địa chỉ: " + listPerson[i].getAddress());
        }
        // Homework_1
        // sử dụng vòng lặp while và do..while để in ra thông tin các phần trong listPerson
        // ......

        // II. KẾ THỪA TRONG LẬP TRÌNH JAVA
        // đối tượng Student là subclass của đối tượng Person
        Student s1 = new Student(); // đối tượng con của Person
        s1.setName("Student 1");
        s1.setAddress("Vietnam");
        s1.setAge(20);
        s1.setClassName("Brse2304");

        System.out.println(s1.getName() + " - " + s1.getAddress());
        System.out.println("Tuổi " + s1.getAge() + ", Lớp: " + s1.getClassName());


        // III. Từ khóa THIS và SUPER
        System.out.println("================================================");
        Student s2 = new Student("Student 2", "Japan");

        s2.setAge(22);
        s2.setClassName("Brse2304");
        System.out.println(s2.getName() + " - " + s2.getAddress());
        System.out.println("Tuổi " + s2.getAge() + ", Lớp: " + s2.getClassName());

        // IV. Override và OverLoad
        // 4.1. Overload method: là những Phương thức có tên giống nhau và đối số truyền vào khác nhau,
        // không quan tâm đến loại kiểu dữ liệu trả về

        int c = tong2so(4, 5);
        float d = tong2so(10, 20f, 30f);
        System.out.println("ham tong 2 so tra ve int: " + c);
        System.out.println("ham tong 2 so tra ve float: " + d);

        // 4.2. Override method: là viết lại 1 hàm của class cha, kiểu đối số truyền vào, kiểu dữ liệu trả về giống hệt class cha.
        //Khi nào cần sử dụng override: khi hàm con cần xử lý logic riêng so với hàm cha
        Person p3 = new Person();
        int dienTichP3 = p3.tinhDienTichHinhVuong(2,2);

        Student s3 = new Student();
        int dienTichS3 = s3.tinhDienTichHinhVuong(2,2);

        System.out.println("dienTichP3 = " + dienTichP3);
        System.out.println("dienTichS3 = " + dienTichS3);

    }

    // ví dụ về overload
    public static int tong2so (int a, int b) {
        int c = a + b;
        return c;
    }

    // hàm này overload lại hàm tổng 2 số phía trên nhưng khác kiểu dữ liệu trả về và khác tham số truyền vào
    public static float tong2so(int a, float b, float d) {
        float c = a + b + d + 10;
        return c;
    }

}
