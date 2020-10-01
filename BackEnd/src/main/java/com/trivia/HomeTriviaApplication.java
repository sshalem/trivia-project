package com.trivia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.trivia.dao.CategoryDao;
import com.trivia.model.Category;
import com.trivia.model.Question;

@SpringBootApplication
public class HomeTriviaApplication implements CommandLineRunner {

	@Autowired
	private CategoryDao categoryDao;

	public static void main(String[] args) {
		SpringApplication.run(HomeTriviaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Category food = new Category("אוכל");

		Question chalva = new Question();
		chalva.setQuestion("ממה עשוי חלבה");

		Question capital = new Question();
		capital.setQuestion(" בירת ישראל");

		food.addQuestion(chalva);
		food.addQuestion(capital);

		categoryDao.createCategory(food);

		Category foodWhatIsItMadeOf = new Category("ממה המאכל עשוי");
		categoryDao.createCategory(foodWhatIsItMadeOf);

		Category words = new Category("מילים");
		categoryDao.createCategory(words);

		Category songs = new Category("שירים");
		categoryDao.createCategory(songs);

		Category tora = new Category("תורה");
		categoryDao.createCategory(tora);

		Category holidays = new Category("חגים");
		categoryDao.createCategory(holidays);

		Category hebrew = new Category("עיברית");
		categoryDao.createCategory(hebrew);

		Category math = new Category("חשבון");
		categoryDao.createCategory(math);

		Category shapes = new Category("צורות");
		categoryDao.createCategory(shapes);

		Category animals = new Category("חיות");
		categoryDao.createCategory(animals);

		Category time = new Category("זמן");
		categoryDao.createCategory(time);

		Category nature = new Category("טבע");
		categoryDao.createCategory(nature);

		Category whatIsItMadeOf = new Category("ממה זה עשוי");
		categoryDao.createCategory(whatIsItMadeOf);

		Category family = new Category("משפחה");
		categoryDao.createCategory(family);

		Category vehicles = new Category("תחבורה");
		categoryDao.createCategory(vehicles);

		Category safety = new Category("בטיחות");
		categoryDao.createCategory(safety);

		Category sport = new Category("ספורט");
		categoryDao.createCategory(sport);

	}

}
