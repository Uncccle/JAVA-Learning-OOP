package Yongzhi;

public class Student_Info_Test {

    public static void main(String[] args) {

        Student_Info student_info = new Student_Info();
        Student_Info num_1 = new Student_Info(1, "ss", "nan", 1, 10);
        System.out.println(num_1.getSex());
        System.out.println(num_1.getAge());
        System.out.println(num_1.getGrade());
        System.out.println(num_1.getNo());
        System.out.println(num_1.getStudent_name());

    }
    
}
