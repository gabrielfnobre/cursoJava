package test;

import infra.DAO.DAO;
import model.user_example.OrderItem;
import model.user_example.Orders;
import model.user_example.Product;

public class Aula11_TestManyToOne {
	public static void main(String[] args) {
		
		DAO<Object> dao = new DAO<>();
		DAO<Product> daoProduct = new DAO<>(Product.class);

		Orders order = new Orders();
		Product noteBook = daoProduct.findById(2L);
		OrderItem orderItem = new OrderItem(order, noteBook, 1);
		
		dao
			.openTransaction()
			.insert(order)
			.insert(orderItem)
			.commitTransaction()
			.close();
		
		System.out.println(noteBook.getName());
		
	}
}
