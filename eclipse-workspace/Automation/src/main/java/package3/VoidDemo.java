package package3;

public class VoidDemo {

	public static void main(String[] args) {
		methodRankPoints(201.7);
	}
	public static void methodRankPoints(double points) {
		if (points>=205.5) {
			System.out.println("Rank: A1");
		}else if(points>=120.5) {
			System.out.println("Rank: A2");
		}else {
			System.out.println("Rank: A3");
		}
		
	}

}
