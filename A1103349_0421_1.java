import java.util.*;
public class A1103349_0421_1{
    public static void main(String[] args){
        
        String email;
        System.out.println("請輸入正確格式的電子信箱，全部由小寫英文字母組成");
        Scanner input = new Scanner(System.in);
        email = input.next();

        if(email.matches("[a-z]{1,20}[0-9]{0,20}[@]{1}[a-z0-9.]{0,30}[.]{1}[a-z]{0,20}")){
            System.out.println("輸入正確");
        }else{
            System.out.println("輸入錯誤");
        }
    }
}  
