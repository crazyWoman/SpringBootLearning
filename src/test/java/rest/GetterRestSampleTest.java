package rest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


import static org.junit.jupiter.api.Assertions.*;
import static org.junit.matchers.JUnitMatchers.containsString;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@ExtendWith(SpringExtension.class)//This launches up a simple Spring context for unit testing.

//This will load only the beans annotated with Spring-MVC-related annotations.
// In this example, we are launching a Web MVC Test context with the class under test being GetterRestSample.
@WebMvcTest(GetterRestSample.class)

class GetterRestSampleTest {
// Autowires the MockMvc bean that can be used to make requests.
    @Autowired
    MockMvc mvc;

    @Test
    public void employeeName() throws Exception {
        mvc.perform(
                //Performs a request to /employeeName with the Accept header value application/json.
                MockMvcRequestBuilders.get("/employeeName")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())// Expects that the status of the response is 200 (success).
                .andExpect(MockMvcResultMatchers.content().string("smitha"));
                //"Expects that the content of the response is equal to smitha."
    }

    @Test
    public void employeeNameAndID() throws Exception {
        mvc.perform(
                //Performs a request to /employeeName with the Accept header value application/json.
                MockMvcRequestBuilders.get("/employeeName/2")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())// Expects that the status of the response is 200 (success).
                .andExpect(MockMvcResultMatchers.content().string("albert"));
                //"Expects that the content of the response is equal to smitha."
    }
    @Test
    public void getEmployeeByIdAndReturnEmployee() throws Exception {
        mvc.perform(
                //Performs a request to /employeeName with the Accept header value application/json.
                MockMvcRequestBuilders.get("/employee/2")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())// Expects that the status of the response is 200 (success).
                .andExpect(MockMvcResultMatchers.content().json("{\n" +
                        "  \"employeeid\": 340,\n" +
                        "  \"fname\": \"albert\",\n" +
                        "  \"lname\": \"hernadez\"\n" +
                        "}"));
                //"Expects that the content of the response is equal to smitha."
    }
}