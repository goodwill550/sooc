package Q3;

public class Rectangle {
	int length;
    int breadth;
    public Rectangle(int l, int b){
      length = l;
      breadth = b;
}
public int getArea(){
return length*breadth;
}

public int getPerimeter(){
return 2*(length+breadth);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle a = new Rectangle(4, 5);
		  Rectangle b = new Rectangle(5, 8);
		  System.out.println("Area : "+a.getArea()+" Perimeter is "+a.getPerimeter());
		  System.out.println("Area : "+b.getArea()+" Perimeter is "+b.getPerimeter());

		

	}

}
