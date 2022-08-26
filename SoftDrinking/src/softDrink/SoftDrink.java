package softDrink;

import java.util.Scanner;

public class SoftDrink {

	public static void main(String[] args) {
		int n,k,l,c,d,p,nl,np,m,x,y,result,h;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		l=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		p=sc.nextInt();
		nl=sc.nextInt();
		np=sc.nextInt();

        m=k*l;
        x=m/nl;
        h=c*d;
        y=p/np;
        if(h>x && y>x)
        {
        	System.out.print(x/n);
        }
        else  if(x>h && y>h)
        {
        	System.out.print(h/n);
        }
        else
        {
        	System.out.print(y/n);
        }
	}

}
