package tw.leonchen.myproject.oop.wrapperclass;

public class TestWrapperClassEx1 {

	public static void main(String[] args) {
		String info = "12345";
        System.out.println(info + "+1:" + (info+1));
        
        int number1 = Integer.parseInt(info);
        System.out.println(number1 + "+1:" + (number1+1));
        
        int value =7;
        Integer i1 = value;  //Integer i1 = new Integer(value);
        int num1 = i1;       //int num1 = i1.intValue;
        num1++;
        System.out.println("num1:" + num1);
        
        System.out.println("i1++:" + (i1++));
	}

}
