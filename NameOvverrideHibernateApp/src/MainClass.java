import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.cmcltd.movieMirchi.entity.Movie;

public class MainClass {

	public static void main(String[] args) {

		Movie m = new Movie();
		// m.setId(437238L);
		m.setTitle("Om Shanti Om");
		m.setBudget(4500);

		m.getTag().add("Action");
		m.getTag().add("Comedy");
		m.getTag().add("Horror");

		SessionFactory sf = new Configuration().configure()
				.buildSessionFactory();

		Session s = sf.openSession();
		s.beginTransaction();

		 s.save(m);

		s.getTransaction().commit();

		s.close();

	}
}
