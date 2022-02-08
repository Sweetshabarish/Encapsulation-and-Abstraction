package EandA;

 class Point {
	private int x;
	private int y;
	public void setX(int x) {
		this.x=(x>79?79:(x<0?0:x));
	}
	public void setY(int y) {
		this.y=(y>24?24:(y<0?0:y));
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	


public class Point_class{
	public static void main(String[] args) {
		int a,b;
		Point p=new Point();
		p.setX(22);
		p.setY(44);
		a=p.getX();
		System.out.println("t"+a);
		b=p.getY();
		System.out.println(b);
	}
}
 }
