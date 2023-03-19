package controller;

import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/home")
	public String home() {

		return "home";
	}
	
	@RequestMapping("/addtodo")
	public String addTodo(Model m) {
		m.addAttribute("screenName","addtodo");
		return "home";
	}
	
	//@PathVariable
	@RequestMapping(value="/pathvariable/{name}/{id}", method =RequestMethod.GET, produces = "application/json")
	public String pathVariable(@PathVariable String name,@PathVariable int id) {
		System.out.println("@PathVariable is ::  " + name + "  Id :: " + id); //Print -Kittu
		
		return "@PathVariable is ::  " + name + "  Id :: " + id;
		//URL : http://localhost:8080/SpringMVC_1/pathvariable/Kittu/101
	}
	
	
	//@RequestParam
	@RequestMapping(value="/requestparam",method = RequestMethod.GET,produces = "application/json")
	public String requestParam(@RequestParam("name") String name, @RequestParam("id") int id) {
		System.out.println("@RequestParam is ::  " + name + "  Id :: " + id); //Print -Madhu
		
		return "@RequestParam is ::  " + name + "  Id :: " + id;
		//URL : http://localhost:8080/SpringMVC_1/requestparam?name=Madhu&id=101
	}
	
	//RequestBody
	@PostMapping(value="/getuser",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String getuserDetails(@RequestBody User user) {
		System.out.println("user is ::: " + user.toString());
		return user.toString();
	}
	
		
	
}
