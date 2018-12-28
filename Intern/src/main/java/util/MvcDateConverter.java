package util;

import java.text.SimpleDateFormat; 
import java.util.Date; 

import org.springframework.beans.propertyeditors.CustomDateEditor; 
import org.springframework.web.bind.WebDataBinder; 
import org.springframework.web.bind.support.WebBindingInitializer; 
import org.springframework.web.context.request.WebRequest; 

public class MvcDateConverter implements WebBindingInitializer { 

  public void initBinder(WebDataBinder binder, WebRequest request) { 
      try {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");   
		binder.registerCustomEditor(Date.class, new CustomDateEditor(df,true));
	} catch (Exception e) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");   
		binder.registerCustomEditor(Date.class, new CustomDateEditor(df,true));
	}   
  } 

} 
