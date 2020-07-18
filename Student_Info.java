package Yongzhi;

public class Student_Info {

    //属性
    private int student_num;
    private String  student_name;
    private String sex;
    private int age;
    private int grade;

    public Student_Info(){

    }

    public Student_Info(int student_num, String student_name, String sex, int age, int grade){

        this.age = age;
        this.grade = grade;
        this.sex = sex;
        this.student_name = student_name;
        this.student_num = student_num;

    }

    public int getNo(){

        return this.student_num;

    }

    public String getStudent_name(){

        return this.student_name;

    }

    public String getSex(){

        return this.sex;

    }

    public int getAge(){

        return this.age;

    }

    public int getGrade(){

        return this.grade;

    }

}
