package test;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.Map;

@Controller("/")
public class TestController {

    @Get("/test")
    String test() {
        return "Application response";
    }
}
