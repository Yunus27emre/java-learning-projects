
public class BankAccount {
	private static int ObjectAccount=0;
	private String name;
	private int id;
	public String getName() {
		return name;
	}
	
	public int getID() {
		ObjectAccount++;
		id=ObjectAccount;
		return id;
	}
	public BankAccount() {
		id=ObjectAccount;
	}
	public BankAccount(String name) {
		this.name=name;
		
	}
	public int number_Of_Object() {
		return ObjectAccount;
	}}

