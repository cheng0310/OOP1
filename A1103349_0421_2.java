import java.util.*;
public class A1103349_0421_2{
    public static void main(String[] args){
        
        String date;
        System.out.println("請輸入日期，格式為:YYYY/MM/DD 或 MM/DD/YYYY");
        Scanner input = new Scanner(System.in);
        date = input.next();

        if(date.matches("[0-9]{1,4}[/]{1}[0-1]{0,1}[0-9]{1}[/]{1}[0-3]{0,1}[0-9]{1}")){  
            System.out.println("輸入正確，日期為:"+date);
        }else if(date.matches("[0-1]{0,1}[0-9]{1}[/]{1}[0-3]{0,1}[0-9]{1}[/][0-9]{1,4}")){  
            System.out.println("輸入正確，日期為:"+date);
        }else{
            System.out.println("輸入錯誤");
        }
    }
} 
