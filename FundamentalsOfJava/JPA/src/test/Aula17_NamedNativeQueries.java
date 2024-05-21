package test;

import infra.DAO.DAO;
import model.user_example.MovieNote;

public class Aula17_NamedNativeQueries {
	public static void main(String[] args) {
		
		DAO<MovieNote> movieNote = new DAO<>(MovieNote.class);
		
		Double average = movieNote.queryAverageMovies("getGeneralAverageOfMovies").getAverage();
		
		System.out.printf("%.1f", average);
	}
}
