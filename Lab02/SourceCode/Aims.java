
public class Aims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		DigitalVideoDisc cart[] = new DigitalVideoDisc[n];
		Cart anOrder = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc ("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f); 
		anOrder.addDigitalVideoDisc(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc ("Aladin", "Animation", 18.99f); 
		for (int i=0;i<3;i++) {
			cart[i]=dvd3;
		}
		anOrder.addDigitalVideoDisc(cart);
		anOrder.removeDigitalVideoDisc(dvd1);
		System.out.println("Total Cost is: "); 
		System.out.println(anOrder.totalCost());
		}

	}


