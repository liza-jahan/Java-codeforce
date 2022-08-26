package alarmClock;

import java.util.Scanner;

public class AlarmClock {

	public static void main(String[] args) {
	long  a,b,c,d,e=0,f;
	long t;
	Scanner sc=new Scanner(System.in);
	t=sc.nextLong();
	for(int i=0;i<t;i++)
	{
	a=sc.nextLong();
	b=sc.nextLong();
	c=sc.nextLong();
	d=sc.nextLong();
	
	if(a>b && c>d)
	{
		a=a-b;
		e=b+((a+c-d-1)/(c-d)*c);
	}
	else if(a>b && d>=c)
	{
		
	e=-1;
	}
	else if(b>a || a==b)
	{
		e=b;
	}
	System.out.println(e);
	}

	}

}
