package tw.leonchen.myproject.oop.collections.generic;

class TestInteger{
	private Integer i1;

	public Integer getI1() {
		return i1;
	}

	public void setI1(Integer i1) {
		this.i1 = i1;
	}
}

class TestDouble{
	private Double d1;

	public Double getD1() {
		return d1;
	}

	public void setD1(Double d1) {
		this.d1 = d1;
	}
}

//...

class TestObject{
	private Object o1;

	public Object getO1() {
		return o1;
	}

	public void setO1(Object o1) {
		this.o1 = o1;
	}
}

class TestGenerics<T>{
	private T t1;

	public T getT1() {
		return t1;
	}

	public void setT1(T t1) {
		this.t1 = t1;
	}
}

public class CallTestGenericsEx1 {

	public static void main(String[] args) {
		//TestObject test1 = new TestObject();
		//test1.setO1(6);
		//Double d2 = (Double)test1.getO1();
		//System.out.println("d2+1=" + (d2+1));
		
		TestGenerics<Integer> i2 = new TestGenerics<Integer>();
		i2.setT1(3);
		int num1 = i2.getT1();
		System.out.println("num1+1:" + (num1+1));
		
		TestGenerics<Double> i3 = new TestGenerics<Double>();
		i3.setT1(3.14);
		double pi = i3.getT1();
		System.out.println("(pi*Math.pow(10, 2)):" + (pi*Math.pow(10, 2)));
	}

}
