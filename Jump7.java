/*
The function of this program is to print out
1~100 numbers with 7 or 7 multiples
*/
//Author:@Yh
public class Jump7{
    public static void main(String[] args){
        for(int i =0;i<=100;i++){
            if(i%7==0 || i%10 == 7 || i/10 ==7)
            continue;
            System.out.println(i);
        }
    }
}

