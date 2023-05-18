
package com.fjordtek.bookstore.model.auth;

/**
*
* This interface defines additional methods for UserRoleRepository.
*
*/

public interface UserRoleRepositoryCustom {
	UserRole findByCompositeId(Long userId, Long roleId);

	void deleteByCompositeId(Long userId, Long roleId);
}