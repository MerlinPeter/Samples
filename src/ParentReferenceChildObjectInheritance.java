
public class ParentReferenceChildObjectInheritance {
	
	int x=10;
	public void add(){
		int y =x+10;
	}
	
	public void sub(){
		int y =x-10;
	}
	
	public class Child extends ParentReferenceChildObjectInheritance{
		int x=10;
		public void add(){
			int y =x+10;
		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
