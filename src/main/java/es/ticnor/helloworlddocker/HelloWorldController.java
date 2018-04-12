/*
 */
package es.ticnor.helloworlddocker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Alejandro Villar <avillar@ticnor.es>
 */
@Controller
@RequestMapping
public class HelloWorldController {
    
    @RequestMapping
    public String hello() {
        return "hello";
    }
}
