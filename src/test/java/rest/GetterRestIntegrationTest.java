package rest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.equalTo;

@ExtendWith(SpringExtension.class)
// It provides additional functionality on top of the Spring TestContext.
// Provides support to configure the port for fully running the container
// and TestRestTemplate (to execute requests).
@SpringBootTest(classes = RestStarter.class,
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class GetterRestIntegrationTest {
    private static final String LOCAL_HOST =
            "http://localhost:";
    @LocalServerPort
    //The SpringBootTest would ensure that the port on which the container is running is autowired into the port variable.
    private int port;
    //TestRestTemplate is typically used in integration tests. It provides additional functionality on top of RestTemplate,
    // which is especially useful in the integration test context.
    // It does not follow redirects so that we can assert response location.
    private TestRestTemplate template = new TestRestTemplate();


    @Test
    public void welcome() throws Exception {
        ResponseEntity<String> response = template
                .getForEntity(createURL("/employeeName"), String.class);
        assertThat(response.getBody().contains("smitha"));
        assertThat(response.getStatusCode().is2xxSuccessful());
    }
    @Test
    public void getEmployeeByIdAndReturnEmployee() throws Exception {
        ResponseEntity<Employee> response = template
                .getForEntity(createURL("/employee/2"), Employee.class);
        assertThat(response.getBody().getFname().equalsIgnoreCase("albert"));
        assertThat(response.getBody().getLname().equalsIgnoreCase("hernadez"));
        assertThat(response.getStatusCode().is2xxSuccessful());
    }

    private String createURL(String uri) {
        System.out.println("port:"+port);
        return LOCAL_HOST + port + uri;
    }
}