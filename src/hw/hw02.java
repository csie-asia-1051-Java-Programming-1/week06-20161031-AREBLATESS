package hw;
//���ϥΪ̿�J�ʧO�P�����A�z�L��ƩI�s�A�̾ڨk�k���P, ���o(�L)�p��ÿ�X��з��魫
//((1)�k�G(����-170)0.6+62 , (2)�k�G(����-158)0.5+52)�C
//��ƺ�X���G��n�^�ǦܥD�{���A�L�X���G�C�Ҧp:
//��J 1 170 �h��X 62.0
//��J 2 165 �h��X 55.5
import java.util.Scanner;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int type=scn.nextInt();
		double h=scn.nextFloat();
		System.out.print(fun1(type,h));}
	
	public static double fun1(int type,double h){
		double w=0;
		switch(type){
		case 1:
			w=(h-170)*0.6+62;
			
			break;
		case 2:
			w=(h-158)*0.5+52;
			
			break;
		}
		return w;
		
	}

}
