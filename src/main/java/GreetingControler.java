import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/greeting" )
public class GreetingControler {
    @GetMapping
    public ResponseEntity<String>sayHello(){
        return ResponseEntity.ok("Hello from ou API");
    }
    @GetMapping("/say-goodbye")
    public ResponseEntity<String>sayGoodBye(){
        return ResponseEntity.ok("Good bye API");
    }
}
