package 蓝桥Java.算法训练;
/*
  算法训练 反置数  
时间限制：1.0s   内存限制：512.0MB
   
问题描述
　　一个整数的“反置数”指的是把该整数的每一位数字的顺序颠倒过来所得到的另一个整数。如果一个整数的末尾是以0结尾，那么在它的反置数当中，这些0就被省略掉了。比如说，1245的反置数是5421，而1200的反置数是21。请编写一个程序，输入两个整数，然后计算这两个整数的反置数之和sum，然后再把sum的反置数打印出来。要求：由于在本题中需要多次去计算一个整数的反置数，因此必须把这部分代码抽象为一个函数的形式。
　　输入格式：输入只有一行，包括两个整数，中间用空格隔开。
　　输出格式：输出只有一行，即相应的结果。
　　输入输出样例
样例输入
435 754
样例输出
199

 */
import java.util.Scanner;

public class ALGO_93$反置数 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String strA = scanner.next();
		String strB = scanner.next();
		System.out.println(reserve(String.valueOf(reserve(strA)+reserve(strB))));
		
	}
	
	private static int reserve(String str) {
		StringBuffer strBuff = new StringBuffer();
		for(int i=str.length()-1;i>=0;i--) {
			strBuff.append(str.charAt(i));
		}
		return Integer.valueOf(strBuff.toString());
	}
}
