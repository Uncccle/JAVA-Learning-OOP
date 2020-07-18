package Yongzhi;

public class NetworkUser {

    private String ID;
    private String password;
    private String email;



    public  NetworkUser(){

    }

    public  NetworkUser(String ID,String password){

        this.ID = ID;
        this.password = password;
        this.email = ID + "@gameschool.com";


    }

    public  NetworkUser(String ID,String password,String email){

        this.ID = ID;
        this.password = password;
        this.email = email;

    }

    public void show(){

        System.out.println("ID为："+this.ID);
        System.out.println("Email为："+this.email);
        System.out.println("Password为："+this.password);

    }

    public static void main(String[] args) {

        NetworkUser Person = new NetworkUser();
        NetworkUser Person_A = new NetworkUser("ss","1");
        Person_A.show();

        NetworkUser Person_B = new NetworkUser("zz", "1111", "ss1");
        Person_B.show();

    }

}
