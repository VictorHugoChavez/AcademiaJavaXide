package archivos.configuracion;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override  // este es como el dront controller, con el dispacher extiends de abstractaAnotation
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { archivoDeConfig.class }; //cual va ser el archivo de archivoDeConfig
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };// este es para hacer las peticiones, a partir de donde 
	}

}





