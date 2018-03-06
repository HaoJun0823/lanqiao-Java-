package 蓝桥Java.算法训练;
//算法训练 猴子分苹果  
//时间限制：1.0s   内存限制：256.0MB
// 
//问题描述
//秋天到了，n只猴子采摘了一大堆苹果放到山洞里，约定第二天平分。这些猴子很崇拜猴王孙悟空，所以都想给他留一些苹果。第一只猴子悄悄来到山洞，把苹果平均分成n份，把剩下的m个苹果吃了,然后藏起来一份，最后把剩下的苹果重新合在一起。这些猴子依次悄悄来到山洞，都做同样的操作，恰好每次都剩下了m个苹果。第二天，这些猴子来到山洞，把剩下的苹果分成n分，巧了，还是剩下了m个。问，原来这些猴子至少采了多少个苹果。
//输入格式
//两个整数，n m
//输出格式
//一个整数，表示原来苹果的数目
//样例输入
//5 1
//样例输出
//15621
//数据规模和约定
//0<m<n<9

import java.util.Scanner;

public class ALGO_121$猴子分苹果 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int n  = scanner.nextInt();
		int m = scanner.nextInt();
		System.out.println(((int) (Math.pow(n, n+1)-(n-1)*m)));
		
	}
	
}
