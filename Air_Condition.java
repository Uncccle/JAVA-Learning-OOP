package Yongzhi;

public class Air_Condition {

    String band;
    int Power_num;
    int temp;

    public void add_hot(){

        System.out.println("我能加热");

    }

    public void add_cold(){

        System.out.println("我能制冷");

    }

    public void add_wind(){

        System.out.println("我能通风");

    }

    public static void main(String[] args) {
        Air_Condition air_condition = new Air_Condition();
        air_condition.add_cold();
        air_condition.add_hot();
        air_condition.add_wind();
    }

}
