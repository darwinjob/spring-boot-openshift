package no.uio.nesys.sbo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!"; //This string is used in JUnit HelloControllerTest.java
	}
	
	@RequestMapping("hello")
    public String sayHello(){
        return ("Hello, SpringBoot on @RequestMapping");
    }

}