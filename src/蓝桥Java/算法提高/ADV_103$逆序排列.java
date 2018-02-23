package 蓝桥Java.算法提高;
import java.util.Scanner;
import java.util.Vector;
/*

  算法提高 逆序排列  
时间限制：1.0s   内存限制：512.0MB
   
问题描述
　　编写一个程序，读入一组整数（不超过20个），并把它们保存在一个整型数组中。当用户输入0时，表示输入结束。然后程序将把这个数组中的值按逆序重新存放，并打印出来。例如：假设用户输入了一组数据：7 19 -5 6 2 0，那么程序将会把前五个有效数据保存在一个数组中，即7 19 -5 6 2，然后把这个数组中的值按逆序重新存放，即变成了2 6 -5 19 7，然后把它们打印出来。
　　输入格式：输入只有一行，由若干个整数组成，中间用空格隔开，最末尾的整数为0。
　　输出格式：输出也只有一行，即逆序排列后的整数，中间用空格隔开，末尾没有空格。
　　输入输出样例
样例输入
7 19 -5 6 2 0
样例输出
2 6 -5 19 7

 */
public class ADV_103$逆序排列 {
	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<Integer>();
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		while(num!=0) {
			vector.add(num);
			num = scanner.nextInt();
		}
		scanner.close();
		for(int i=vector.size()-1;i>=0;i--) {
			System.out.print(vector.get(i)+" ");
		}
	}
}
