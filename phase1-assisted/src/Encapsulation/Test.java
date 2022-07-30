package Encapsulation;

public class Test {
	public static void main(String[] args) {

			Student student = new Student();
			student.id = 71;
			student.name = "HARSHA";
			student.courseName = "JAVA-FSD";
			student.age = 20;

			student.printDetails();
			
			BankAccount acc = new BankAccount(10000);
			acc.setAccountName("XYZ");
			acc.setAccountNumber(84);
			acc.depositMoney(3000);
			acc.withdrawMoney(4000);
			acc.printDetails();
			
			Product product = new Product(1, "Phone", 50000);
			int id = product.getId();
			System.out.println("Product Id: " + id);
	}
}
		