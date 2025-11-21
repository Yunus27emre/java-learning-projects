
public class Hafta3_Ornek2 {

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();
		System.out.println( b1.getID()+" " +b1.getName());
		BankAccount b2 = new BankAccount("mehmet");
		System.out.println(b2.getID() + " " + b2.getName());
		BankAccount b3=new BankAccount("Yunus");
		System.out.println(b3.getID()+" "+b3.getName());
		System.out.println(b3.number_Of_Object());
		BankAccount[] bank=new BankAccount[5];
		String[] arrays= {"Ali","Veli","Ayşe","Fatma","İmparator"};
		for(int i=0;i<bank.length;i++) {
			bank[i]=new BankAccount(arrays[i]);
			System.out.println(bank[i].getID()+" "+bank[i].getName());
		}
		System.out.println(b3.number_Of_Object());
	}

}
