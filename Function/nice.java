package fff;

import java.util.Scanner;

public class nice {
	public static void main(String args[]){
		System.out.println("������a,b,c��ֵ��");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		double x1,x2,t;
		t=b*b-4*a*c;
		System.out.println("����"+a+"x*x+"+b+"x+"+c+"=0�Ľ�");
		if(t<0){
			System.out.println("�˷����޽�");
		}else{
			x1=((-b)+Math.pow(t, 1/2))/(2*a);
			x2=((-b)-Math.pow(t, 1/2))/(2*a);
			System.out.println("x1="+x1+","+"x2="+x2);
		}
		
	}

}
