package Yongzhi;
/*
*
* 定义类的时候需要包含一下组件：
*
*       私有属性
*       构造方法
*       set/get方法
*       普通方法
*
*
*
* */
public class Dog {

    private String name;
    private int age;
    private String color;

    public Dog(){


    }

    public Dog(String name, int age, String color){

        this.name = name;
        if(age>0){
            this.age = age;
        }else {

            System.out.println("年龄不符合");
        }
        this.color = color;

    }

    public void setAge(int age){
        if(age>0){
            this.age = age;
        }else {

            System.out.println("年龄不符合,请重新输入");
        }
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String name){

        this.name = name;

    }

    public String getName(){
        return this.name;
    }

    public void setColor(String color){

        this.color = color;

    }

    public String getColor(){
        return this.color;
    }

    public void eat(){

        System.out.println("eating 骨头");

    }

    public void play(){

        System.out.println("playing...");

    }

    public void show(){

        System.out.println("name = "+this.name);
        System.out.println("age = "+this.age);
        System.out.println("color = "+this.color);

    }

}
