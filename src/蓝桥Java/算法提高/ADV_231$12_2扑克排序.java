package 蓝桥Java.算法提高;
import java.util.Arrays;
import java.util.Scanner;
/*
  算法提高 12-2扑克排序  
时间限制：1.0s   内存限制：256.0MB
   
问题描述
　　扑克牌排序：构造扑克牌数组，对扑克牌进行排序。排序原则如下：数字从小到大是2-10、J、Q、K和A，花色从小到大是方块（diamond）、梅花（club）、红桃（heart）、黑桃（spade）。两张牌比较时先看数字，数字相同时看花色。要求对输入的扑克牌进行从小到大排序。
　　输入五张牌（表示黑桃2、红桃3、黑桃3、方块A和梅花J）： 2 s 3 h 3 s A d J c
　　输出结果应为：2 s 3 h 3 s J c A d数组长度固定为5。
样例输出
与上面的样例输入对应的输出。
例：
数据规模和约定
　　输入数据中每一个数的范围。

 */
public class ADV_231$12_2扑克排序 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String all = sc.nextLine();
		sc.close();
		String c = "dchs";
		String n = "23456789SJQKA";
		all = all.replaceAll("10", "S");
		// System.out.println(all);
		int[] array = new int[5];
		for (int i = 0, j = 0; i < array.length; i++, j += 2) {
			// System.out.println(i);
			array[i] = n.indexOf(all.charAt(j)) * 10 + c.indexOf(all.charAt(j + 1));
		}
		Arrays.sort(array);
		// System.out.println(Arrays.toString(array));
		all = "";
		for (int i = 0; i < array.length; i++) {
			int sz = array[i] / 10;
			int hs = array[i] % 10;
			all += n.charAt(sz) + "" + c.charAt(hs) + " ";
			// System.out.println(all);
		}
		// System.out.println(all);
		all = all.replaceAll("S", "10");
		System.out.print(all);
	}
}
