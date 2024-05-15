package test;

import infra.DAO.DAO;
import model.user_example.OrderItem;
import model.user_example.Orders;
import model.user_example.Product;

public class Aula11_TestManyToOne {
	public static void main(String[] args) {
		
		DAO<Object> dao = new DAO<>();

		Orders order = new Orders();
		Product refrigerator = new Product("refrigerator", 4525.99);
		Product microwave = new Product("microwave", 400.99);
		OrderItem orderItem = new OrderItem(order, refrigerator, 1);
		OrderItem orderItem2 = new OrderItem(order, microwave, 1);
		
		dao
			.openTransaction()
			.insert(refrigerator)
			.insert(microwave)
			.insert(order)
			.insert(orderItem)
			.insert(orderItem2)
			.commitTransaction()
			.close();
		
		
	}
}
