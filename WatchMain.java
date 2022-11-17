package Lab11;

public class WatchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tissot t = new Tissot();
		Seiko s = new Seiko();
		Carson c = new Carson();
		Quartz q = new Quartz();
		Watch w = new Watch();
		
		System.out.println("--Tissot--");
			t.property();
			t.display();
		
		System.out.println("\n\n--Seiko--");
			s.design();
			s.display();
			
		System.out.println("\n\n--Carson--");
			c.type();
			c.property();
			c.display();
		
		System.out.println("\n\n--Quartz--");
			q.type();
			q.design();
			q.display();
			
		System.out.println("\n\n--Watch--");
			w.display();
	}

}
