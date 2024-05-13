package test;

import infra.DAO.DAO;
import model.user_example.Clients;
import model.user_example.Seat;

public class Aula08_TestOneToOne {
	public static void main(String[] args) {
		
		Seat seatB12 = new Seat("B12");
		Clients client = new Clients("João", seatB12);
		
		DAO<Object> dao = new DAO<>();
		
		dao
			.openTransaction()
			.insert(seatB12)
			.insert(client)
			.commitTransaction();
		
	}
}
