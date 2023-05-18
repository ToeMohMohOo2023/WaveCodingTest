
package com.fjordtek.bookstore.model.book;

import java.util.List;

/**
*
* This interface defines additional methods for BookRepository.
*
*/

public interface BookRepositoryCustom {

	void updateWithoutPriceAndWithoutPublish(Book book);

	List<Book> findAllPublished();
}