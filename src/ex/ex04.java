package ex;
/*
 * Topic: 撰寫一函數void square(arr)，在呼叫square(arr) 函數後，一維陣列arr 裡的每一個元素皆會被平方。例如:輸入1 3 5 7, 則輸出1  9   25  49
 * Date: 2016/10/31
 * Author: 105021008 陳畯程
 */
import java.util.Scanner;
public class ex04 {

	public static void main (String args[]){
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String n=scn.nextLine();
		String data[]=n.split(" ");
		square(data);}
	public static void square(String []n){
		int a=0;
		for(int i=0;i<n.length;i++){
			a=Integer.parseInt(n[i]);
			System.out.print((int)Math.pow( a,2)+"\t");
		}
		
	}

}