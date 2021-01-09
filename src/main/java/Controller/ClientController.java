package Controller;

import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping
public class ClientController {

    private final RestTemplate restTemplate;

    public ClientController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    private static String GET_URL = "http://localhost:8080/library/get_books";
    private static String POST_URL = "http://localhost:8080/library/post_book";
    private static String DELETE_URL = "http://localhost:8080/library/del_book";

    @GetMapping(value = "/get_postman")
    public String getBooks() {
        ResponseEntity<String> response = restTemplate.exchange(
                GET_URL,
                HttpMethod.GET,
                null,
                String.class);
        if (response.getStatusCode() == HttpStatus.OK) {
            System.out.println("Get запрос:");
            System.out.println(response.getBody());
            return response.getBody();
        } else {
            System.out.println("Request Failed");
            System.out.println(response.getStatusCode());
            return null;
        }
    }

    @PostMapping(value = "/post_postman")
    public Void createBook() {
        Map<String, String> map = new HashMap<>();
        map.put("book_title", "Замок");
        map.put("book_price", "120");
        map.put("book_pages", "50");
        map.put("date_of_publication", "1968-05-02");
        ResponseEntity<Void> response = restTemplate.postForEntity(POST_URL, map, Void.class);
        return response.getBody();
    }

    @DeleteMapping(value = "/delete_postman/{id}")
    public void deleteBook(@PathVariable("id") int id){
         restTemplate.delete(DELETE_URL+"/"+id);
    }
}
