package 蓝桥Java.算法训练;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
/*

  算法训练 明明的随机数  
时间限制：1.0s   内存限制：256.0MB
   
问题描述
　　明明想在学校中请一些同学一起做一项问卷调查，为了实验的客观性，他先用计算机生成了N个1到1000之间的随机整数（N≤100），对于其中重复的数字，只保留一个，把其余相同的数去掉，不同的数对应着不同的学生的学号。然后再把这些数从小到大排序，按照排好的顺序去找同学做调查。请你协助明明完成“去重”与“排序”的工作。
输入格式
　　输入有2行，第1行为1个正整数，表示所生成的随机数的个数：
　　N
　　第2行有N个用空格隔开的正整数，为所产生的随机数。
输出格式
　　输出也是2行，第1行为1个正整数M，表示不相同的随机数的个数。第2行为M个用空格隔开的正整数，为从小到大排好序的不相同的随机数。
样例输入
10
20 40 32 67 40 20 89 300 400 15
样例输出
8
15 20 32 40 67 89 300 400
题目来源
　　计13李震摘编自NOIP06PJ01

 */
public class ALGO_111$明明的随机数 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		Set<Integer> set = new TreeSet<Integer>();
		for (int i = 0; i < num; i++) {
			//set.add(new Random().nextInt(1000) + 1);
			set.add(scanner.nextInt());
		}
		scanner.close();
		System.out.println(set.size());
		for(Integer i:set) {
			System.out.print(i+" ");
		}
	}
}
