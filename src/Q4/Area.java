package Q4;

public class Area {
		int length;
		int breadth;
		public Area(int l, int b){
			length = l;
			breadth = b;
		}
		public int getArea(){
			return length*breadth;
		 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		 int l,b;
		 
		 System.out.println("Enter lenght");
		 l = s.nextInt();
		 System.out.println("Enter breadth");
		 b = s.nextInt();
		 
		 Area a = new Area(l,b);
		 System.out.println("Area : "+a.getArea());

	}

}
