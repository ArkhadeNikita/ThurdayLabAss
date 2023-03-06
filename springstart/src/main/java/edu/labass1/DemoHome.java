package edu.labass1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class DemoHome {
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	// method = RequestMethod.GET) This process GET is default
	public String demo3() {
		return "<body bgcolor='black' text='white'><center><h1>Anudip's Home Page</h1></center></body>";
	}

}
