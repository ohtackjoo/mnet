package emp.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmpSelectController{
	private static final Logger logger = LoggerFactory.getLogger(EmpSelectController.class);

	@RequestMapping(value = "/emp/empSelect.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {		
		return "/emp/empSelect";
	}

}
