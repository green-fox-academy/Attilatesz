package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.FrontendApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = FrontendApplication.class)
@WebAppConfiguration
@EnableWebMvc

public class RestControllerTest {
  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void doublingTest() throws Exception{
    mockMvc.perform(get("/doubling")
              .param("input", "15"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.result").value(30));
  }
  @Test
  public void greeterTest()throws Exception{
    mockMvc.perform(get("/greeter")
          .param("name", "Petike")
          .param("title", "student"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.welcome_message")
                    .value("Oh, hi there Petike, my dear student!"));
  }

  @Test
  public void appendTest()throws Exception{
    mockMvc.perform(get("/appenda/{appendable}", "sam"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.appended").value("sama"));
  }

  @Test
  public void doUntilSumTest()throws Exception{
    mockMvc.perform(post("/dountil/{what}", "sum")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\"until\" : \"6\"}"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.result").value(21));
  }

  @Test
  public void doUntilFactTest()throws Exception{
    mockMvc.perform(post("/dountil/{what}", "factor")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\"until\" : \"5\"}"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.result").value(120));
  }

  @Test
  public void doUntilSumNoNumber()throws Exception{
    mockMvc.perform(post("/dountil/{what}", "sum")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.error").value("Please provide a number!"));
  }

  @Test
  public void doUntilFactNoNumber()throws Exception{
    mockMvc.perform(post("/dountil/{what}", "factor")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.error").value("Please provide a number!"));
  }
}