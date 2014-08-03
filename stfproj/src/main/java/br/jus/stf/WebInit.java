/**
 * 
 */
package br.jus.stf;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * @author Ricardo Dias Cavalcante
 *
 */
//public class WebInit{
public class WebInit extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder application) {

		return application.sources(Application.class);
	}

}
