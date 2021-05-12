package social.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
@WebMvcTest
//@RunWith(SpringRunner.class)
class UserControllerTest {
    @Autowired
    MockMvc mockMvc;
    @BeforeEach
    void setUp() {
    }

    @Test
    void getUserRegistration() throws IOException {
//        mockMvc.perform(get("/register"))
//                .andExpect(status().is2xxSuccessful());
    }

    @Test
    void doUserRegistration() {
    }
}