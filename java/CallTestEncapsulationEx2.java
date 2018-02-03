package tw.leonchen.myproject.oop.encapsulation;

class Bank {

	private String name = "Andy";
	private int account = 10000;
	private int age = 18;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

public class CallTestEncapsulationEx2 {

	public static void main(String[] args) {
		Bank bigTree = new Bank();

		bigTree.setAccount(25000);
		int value = bigTree.getAccount();

		System.out.println("value:" + value);
	}

}
