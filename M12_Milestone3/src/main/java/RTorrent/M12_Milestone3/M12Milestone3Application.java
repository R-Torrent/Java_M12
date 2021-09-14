package RTorrent.M12_Milestone3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class M12Milestone3Application {

	public static void main(String[] args) {
		SpringApplication.run(M12Milestone3Application.class, args);
	}
	
    // M12_Milestone3
    @GetMapping("/")
    public String helloWorld() {
        return "HELLO WORLD!";
    }
    
    @GetMapping("/{nom}")
    public String helloNom(@PathVariable(name="nom") String nom) {
    	return "Hello, " + nom;
    }

}
