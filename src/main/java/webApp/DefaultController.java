package webApp;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.util.Date;

@RestController
public class DefaultController {

    @RequestMapping
    public String printTime () {
        return new Date().toString();
    }
}
