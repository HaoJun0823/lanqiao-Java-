package 蓝桥Java.算法训练;

import java.util.Scanner;

/*

  算法训练 数对  
时间限制：1.0s   内存限制：512.0MB
   


问题描述
　　编写一个程序，该程序从用户读入一个整数，然后列出所有的数对，每个数对的乘积即为该数。
　　输入格式：输入只有一行，即一个整数。
　　输出格式：输出有若干行，每一行是一个乘法式子。（注意：运算符号与数字之间有一个空格）
输入输出样例
样例输入
32
样例输出
1 * 32 = 32
2 * 16 = 32
4 * 8 = 32
8 * 4 = 32
16 * 2 = 32
32 * 1 = 32

 */
public class ALGO_102$数对 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i+" * "+num/i+" = "+num);
			}
		}
	}
}
