@RestController
class WebApplication{

    @RequestMapping("/hello")
    def home(){
        "Hello World"
    }
    
}