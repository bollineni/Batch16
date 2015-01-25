package innerclass;

public class CelebrityHouse {
	class CelebrityBeautifulHouse {
		public void strucuture() {
			System.out.println("I got a beautiful Structure");
		}
	}
	public static void main(String[] args) {
		/*CelebrityHouse ch = new CelebrityHouse();
		ch.myHouse();*/

//		CelebrityBeautifulHouse cbh = new CelebrityHouse().new CelebrityBeautifulHouse();
		CelebrityHouse ch = new CelebrityHouse();
		CelebrityBeautifulHouse cbh = ch.new CelebrityBeautifulHouse();
		
		cbh.strucuture();
	}
	
	public void myHouse(){
		System.out.println("THis is my House");
	}
}
