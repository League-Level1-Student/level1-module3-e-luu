package backpack;

public class BackpackRunner {
	public static void main(String[] args) {
		Backpack back = new Backpack();
		Pencil pencil = new Pencil();
		Ruler ruler = new Ruler();
		Textbook textbook = new Textbook();
		back.putInBackpack(pencil);
		back.putInBackpack(ruler);
		back.putInBackpack(textbook);
		back.goToSchool();
		
	}
	
}
