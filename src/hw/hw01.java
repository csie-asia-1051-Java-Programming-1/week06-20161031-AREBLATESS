package hw;
//�г]�p�@�Ө��fun(v1, type)�A���ϥΪ̿�J�@�ӷū׭Ȥέp��覡
//type��1�ɵؤ�->���Ftype��2�����->�ؤ�
//��ƺ�X���G��n�^�ǦܥD�{���A�L�X���G�C(F=C*9/5+32), (C = (F-32) * (5/9)�Ҧp:
//��J 100 1 �h��X37.77778
//��J 37.77778 2 �ɫh��X 100.0
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
		case 1: //v1�ئ� v2���
			v2 = (v1-32) * 5/9;
			System.out.print(v2+"���");
			break;
		case 2: //v1��� v2�ؤ� 
			v2=v1*9/5+32;
			System.out.print((float)v2+"�ؤ�");
			break;}

	}

}
