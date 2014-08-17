import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.cmcltd.movieMirchi.entity.Movie;

public class MainClass {

	public static void main(String[] args) {

		// Movie m = new Movie();
		// // m.setId(437238L);
		// m.setTitle("Om Shanti Om");
		// m.setBudget(4500);
		//
		// m.getTag().add("Action");
		// m.getTag().add("Comedy");
		// m.getTag().add("Horror");
		//
		// // MovieDetail md = new MovieDetail();
		// // md.setRating(5.6f);
		// // md.setDescription("Awsome movie");
		// // md.setDateOfRelease(new Date());
		// // md.setCollection(3700);
		// //
		// // m.setMovieDetail(md);

		SessionFactory sf = new Configuration().configure()
				.buildSessionFactory();

		Session s = sf.openSession();
		s.beginTransaction();

		// s.save(m);

		Movie obtainedMovie = (Movie) s.get(Movie.class, 1L);

		System.out.println("Movie Name : " + obtainedMovie.getTitle());
		System.out.println("Movie ID : " + obtainedMovie.getId());

		
		s.getTransaction().commit();

		s.close();
		
		
		List<String> tagList = obtainedMovie.getTag();

		System.out.println("Taglist Size : " + tagList);
		
		for (String t : tagList) {
			System.out.println(t);
		}


	}
}
