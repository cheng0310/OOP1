import java.util.*;
public class A1103349_0317_1{

    public static void main(String[] args){    
        int n,m;
        Scanner input = new Scanner (System.in);
        System.out.print("請輸入整數n:");
        n = input.nextInt();
        System.out.print("請輸入整數m:");
        m = input.nextInt();
        int[][] arr = new int[n][m]; 
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=(i+1)*(j+1);
            }
        }
        for(int[] i:arr){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
    } 
}
