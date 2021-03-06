package 蓝桥Java.算法提高;



/*
  算法提高 11-1实现strcmp函数  
时间限制：1.0s   内存限制：256.0MB
   
问题描述
　　自己实现一个比较字符串大小的函数，也即实现strcmp函数。函数：int myStrcmp(char *s1,char *s2) 按照ASCII顺序比较字符串s1与s2。若s1与s2相等返回0，s1>s2返回1，s1<s2返回-1。具体来说，两个字符串自左向右逐个字符相比（按ASCII值大小相比较），直到出现不同的字符或遇'\0'为止（注意'\0'值为0，小于任意ASCII字符）。如：
　　"A"<"B"
　　"a">"A"
　　"computer">"compare"
　　"hello"<"helloworld"
样例输出
数据规模和约定
　　字符串长度<100。

 */
import java.util.Scanner;
public class ADV_227$11_1实现strcmp函数 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(myStrcmp(scanner.next(), scanner.next()));
	}

	public static int myStrcmp(String s1, String s2) {
		if (s1.length() > s2.length()) {
			return 1;
		} else {
			if (s1.length() == s2.length()) {
				return 0;
			} else {
				return -1;
			}
		}
	}
}
