package test;

import infra.DAO.DAO;
import model.user_example.ClientBidirection;
import model.user_example.SeatBidirection;

public class Aula10_TestOneToOneBidirection {
	public static void main(String[] args) {
		
		SeatBidirection seat01 = new SeatBidirection("G7");
		ClientBidirection client01 = new ClientBidirection("Jorge", seat01);
		
		DAO<ClientBidirection> dao = new DAO<>(ClientBidirection.class);
		dao.atomicInclusion(client01);
		
		System.out.println(dao.findById(1L).getSeat().getClient().getName());
		System.out.println(dao.findById(1L).getName());
		
	}
}
