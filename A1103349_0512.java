import java.util.*;
import java.util.Scanner;
import java.security.SecureRandom;

class Eat{
    int pork = 5000;
    int beef = 3000;
    int veg = 1000;
    int type = 0;
    int n = 0;
}

class TimerThread extends Thread{
    Eat a;  
    String name;
    public TimerThread(Eat a, String name){
        this.a = a;
        this.name = name;
    }

    public void run(){
        try{            
            for(int i=0 ;i < 900; i++){
                sleep(3000);  
                System.out.printf(this.name + " ");
                a.eat();
            }
        }catch(InterruptedException a){

        }
    }    
}

    public synchronized void eat(){
    
        SecureRandom random = new SecureRandom();

        type = random.nextInt(3) +1;  
        n = random.nextInt(40) +10;  
        if(type==1 && pork >= n){
            pork= pork - n;
            System.out.println("吃了"+r+"顆豬肉水餃, ");
        }else if (type==2 && beef >= n){
            beef= beef - n;
            System.out.println("吃了"+n+"顆牛肉水餃, ");
        }else if (type == 3 && vegetable >= r){
            veg= veg - n;
            System.out.println("吃了"+n+"顆蔬菜水餃, ");
        }

        System.out.println("還剩下"+pork+"顆豬肉水餃, "+beef+"顆牛肉水餃, "+veg+"顆蔬菜水餃"); 

        if(beef < 10 && pork < 10 && veg < 10){
            System.out.println("水餃售完");
            System.exit(0);  
    }
    public void startEat(int x){
        for(int i = 0; i < x; i++){
            TimerThread[] eater = new TimerThread[x];
            eater[i] = new TimerThread(this, "eater" + i);
            eater[i].start();
        }
    }
}

public class A1103349_0512{
    public static void main(String[] args) throws Exception{
        System.out.print("請輸入用餐的顧客人數");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        Eat a= new Eat();
        a.startEat(x);
    }
}    
