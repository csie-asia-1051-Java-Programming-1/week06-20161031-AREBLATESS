package ex;
/*
 * Topic: 使用者輸入兩個整數，透過函數呼叫輸出排列組合函數 C(m,n)。公式: C(m,n) = m!/n!(m-n)!
 * Date: 2016/10/31
 * Author: 105021008 陳畯程
 */
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int m=scn.nextInt();
		int n=scn.nextInt();
		fun1(m,n);}
		public static void fun1(int m,int n){
			
		int o=1;
		int p=1;
		int q=1;
		int sum=0;
		for(int i=1;i<=m;i++){
			o=o*i;
			}
		for(int i2=1;i2<=n;i2++){
			p=p*i2;
			}
		for(int i3=1;i3<=m-n;i3++){
			q=q*i3;
			}
		sum=o/p/q;
			System.out.print(sum);
		}
	}
