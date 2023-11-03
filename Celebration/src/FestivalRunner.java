import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.Celebration.Dhasara;
import com.xworkz.Celebration.Diwali;
import com.xworkz.Celebration.Festival;
import com.xworkz.Celebration.Holi;
import com.xworkz.Celebration.Pongal;
import com.xworkz.Celebration.VinayagarBirthday;

public class FestivalRunner {

	public static void main(String[] args) {
		ApplicationContext obj = new AnnotationConfigApplicationContext(Diwali.class);

		Festival name = obj.getBean(Diwali.class);

		name.celebrate();

		ApplicationContext obj1 = new AnnotationConfigApplicationContext(Dhasara.class);

		Festival name1 = obj1.getBean(Dhasara.class);

		name1.celebrate();
		ApplicationContext obj2 = new AnnotationConfigApplicationContext(VinayagarBirthday.class);

		Festival name2 = obj2.getBean(VinayagarBirthday.class);

		name2.celebrate();
		ApplicationContext obj3 = new AnnotationConfigApplicationContext(Pongal.class);

		Festival name3 = obj3.getBean(Pongal.class);

		name3.celebrate();

		ApplicationContext obj4 = new AnnotationConfigApplicationContext(Holi.class);

		Festival name4 = obj4.getBean(Holi.class);

		name4.celebrate();

	}

}
