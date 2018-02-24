package 蓝桥Java.算法提高;
/*

  算法提高 简单加法  
时间限制：1.0s   内存限制：256.0MB
   
问题描述
　　小于10的自然数中有四个数字能除尽3或5（3， 5， 6， 9），它们的和为23。
　　请计算所有小于1000的自然数中能除尽3或5的数字的合。然后使用标准输出cout，输出你的结果。
输入格式
　　无。
输出格式
　　一行一个整数，表示你的结果。

 */
public class ADV_178$简单加法 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=3;i<1000;i++) {
			if(i%3==0||i%5==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}
