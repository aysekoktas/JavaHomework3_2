package Interfaces;

public class Main {

	public static void main(String[] args) {
		//ICustomerDal customerDal = new MySqlCustomerDal();
		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
		//customerManager.customerDal= new MySqlCustomerDal();
		customerManager.add();
	}

}
