
package com.fjordtek.bookstore.service.session;

import java.io.IOException;

/**
*
* This interface defines methods of BookStoreExternalUrlServiceImpl class.
*
*
*/

public interface BookStoreExternalUrlService {

	boolean getUrl(String url) throws IOException;

}