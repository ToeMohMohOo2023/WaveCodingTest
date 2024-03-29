
package com.fjordtek.bookstore.model.auth;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * This interface extends CrudRepository interface, implementing
 * custom methods for a repository containing User entities.
 *
 */

//TODO un-hardcode path & itemResourceHel
//
@RepositoryRestResource(
		path            = "users",
		itemResourceRel = "users",
		exported        = true
		)
public interface UserRepository extends CrudRepository<User, Long> {

	User findByUsername(String username);

}