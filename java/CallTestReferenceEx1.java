package tw.leonchen.myproject.oop;

class Shirt{
	int price = 2000;
	char size = 'L';
}

public class CallTestReferenceEx1 {

	public static void main(String[] args) {
		Shirt myShirt = new Shirt();
		myShirt.price = 3000;
        myShirt.size = 'M';
        
        Shirt yourShirt = new Shirt();
        yourShirt.price = 5000;
        yourShirt.size = 'S';
        
        System.out.println("myShirt:" + myShirt);
        System.out.println("yourShirt:" + yourShirt);
        
        System.out.println("myShirt.price:" + myShirt.price);
        System.out.println("myShirt.size:" + myShirt.size);
        
        System.out.println("yourShirt.price:" + yourShirt.price);
        System.out.println("yourShirt.size:" + yourShirt.size);
        
        yourShirt = myShirt;
        System.out.println("yourShirt = myShirt");
        
        yourShirt.price = 30000;
        yourShirt.size = 's';
        
        System.out.println("myShirt_1:" + myShirt);
        System.out.println("yourShirt_1:" + yourShirt);
        
        System.out.println("myShirt.price_1:" + myShirt.price);
        System.out.println("myShirt.size_1:" + myShirt.size);
	}

}
