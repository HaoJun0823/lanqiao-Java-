package 蓝桥Java.算法提高;
import java.util.Scanner;
/*
  算法提高 身份证号码升级  
时间限制：1.0s   内存限制：256.0MB
   
问题描述
　　从1999年10月1日开始，公民身份证号码由15位数字增至18位。(18位身份证号码简介)。升级方法为：
　　1、把15位身份证号码中的年份由2位(7,8位)改为四位。
　　2、最后添加一位验证码。验证码的计算方案：
　　将前 17 位分别乘以对应系数 (7 9 10 5 8 4 2 1 6 3 7 9 10 5 8 4 2) 并相加，然后除以 11 取余数，0-10 分别对应 1 0 x 9 8 7 6 5 4 3 2。
　　请编写一个程序，用户输入15位身份证号码，程序生成18位身份证号码。假设所有要升级的身份证的四位年份都是19××年
输入格式
　　一个15位的数字串，作为身份证号码
输出格式
　　一个18位的字符串，作为升级后的身份证号码
样例输入
110105491231002
样例输出
11010519491231002x
数据规模和约定
　　不用判断输入的15位字符串是否合理

 */
public class ADV_171$身份证号码升级 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int lastNum = 0;
		StringBuffer strBuff = new StringBuffer(scanner.next());
		int[] arr = {7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
		String last = "10x98765432";
		strBuff.insert(6, "19");
		for(int i=0;i<arr.length;i++) {
			lastNum += Integer.valueOf(String.valueOf(strBuff.charAt(i)))*arr[i];
		}
		strBuff.append(last.charAt(lastNum%11));
		System.out.println(strBuff);
		
	}
	
}
