import java.util.*;
public class shapeee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
class Shape{
	private int r,l,w,a,b,type=0;
	private float angle;
	private static int count=0;
	public Shape(int r1){
		r=r1;count++;type=1;			
	}
	public Shape(int l1,int w1){
		l=l1;w=w1;count++;type=2;
	}
	public Shape(int a1,int b1,float angle1){
		a=a1;b=b1;angle=angle1;count++;type=3;
	}
	public float getPerimeter(){
		float ans=0.0f;
		switch (type){
		case 1:
			ans=(r+r)*3.14f;break;
		case 2:
			ans=(w+l)*2;break;
		case 3:ans=(float) ((a*a)+(b*b)-(2*a*b*Math.cos(angle)))+a+b;break;
		}return ans;
	}
	public float getArea(){
		float ans2=0.0f;
		switch (type){
		case 1:
			ans2=r*r*3.14f;break;
		case 2:
			ans2=w*l;break;
		case 3:
			ans2=(float) (1/2*a*b*Math.sin(angle));break;
		}return ans2;
	}
	public static int getCount(){
		return count;
	}
}