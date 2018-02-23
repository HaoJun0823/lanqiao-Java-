package 蓝桥Java.基础练习;
import java.util.Scanner;
/*
  基础练习 分解质因数  
时间限制：1.0s   内存限制：512.0MB
   
问题描述
　　求出区间[a,b]中所有整数的质因数分解。
输入格式
　　输入两个整数a，b。
输出格式
　　每行输出一个数的分解，形如k=a1*a2*a3...(a1<=a2<=a3...，k也是从小到大的)(具体可看样例)
样例输入
3 10
样例输出
3=3
4=2*2
5=5
6=2*3
7=7
8=2*2*2
9=3*3
10=2*5
提示
　　先筛出所有素数，然后再分解。
数据规模和约定
　　2<=a<=b<=10000

 */
public class BASIC_16$分解质因数 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int start = scanner.nextInt(), end = scanner.nextInt();
		for (; start <= end; start++) {
			int i = start, n = 2;
			boolean first = true;
			System.out.print(start + "=");
			while (i > 1) {
				if (i % n == 0) {
					if (first) {
						System.out.print(n);
						first = false;

					} else {
						System.out.print("*" + n);
					}
					i /= n;
				} else {
					n++;
				}
			}
			System.out.println();
		}
	}
}
