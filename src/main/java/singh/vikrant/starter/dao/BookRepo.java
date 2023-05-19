package singh.vikrant.starter.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import singh.vikrant.starter.model.Book;

public interface BookRepo extends MongoRepository<Book, Integer> {

}
