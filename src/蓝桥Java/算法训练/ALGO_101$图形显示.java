package 蓝桥Java.算法训练;
/*

  算法训练 图形显示  
时间限制：1.0s   内存限制：512.0MB
   
问题描述
　　编写一个程序，首先输入一个整数，例如5，然后在屏幕上显示如下的图形（5表示行数）：
　　* * * * *
　　* * * *
　　* * *
　　* *
　　*

 */
import java.util.Scanner;

public class ALGO_101$图形显示 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for(int i=num;i>0;i--) {
			for(int j=0;j<i-1;j++) {
				System.out.print("* ");
			}
			System.out.println('*');
		}
	}
}
