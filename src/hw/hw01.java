package hw;
//請設計一個函數fun(v1, type)，讓使用者輸入一個溫度值及計算方式
//type為1時華氏->攝氏；type為2時攝氏->華氏
//函數算出結果後要回傳至主程式再印出結果。(F=C*9/5+32), (C = (F-32) * (5/9)例如:
//輸入 100 1 則輸出37.77778
//輸入 37.77778 2 時則輸出 100.0
import java.util.Scanner;
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		double v1=scn.nextDouble();
		int type=scn.nextInt();
		fun1(v1,type);}
	public static void fun1(double v1,int type){
		double v2=0;
		switch(type){
		case 1: //v1華式 v2攝氏
			v2 = (v1-32) * 5/9;
			System.out.print(v2+"攝氏");
			break;
		case 2: //v1攝氏 v2華氏 
			v2=v1*9/5+32;
			System.out.print((float)v2+"華氏");
			break;}

	}

}
