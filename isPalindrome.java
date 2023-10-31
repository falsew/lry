package Number.java.util;

import java.util.Scanner;

public class isPalindrome {
    public isPalindrome(int x){
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入一个整数");
        x=scanner.nextInt();
        System.out.println(new isPalindrome(x));

    }
}
