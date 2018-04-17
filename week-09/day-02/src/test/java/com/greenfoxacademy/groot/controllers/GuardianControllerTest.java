package com.greenfoxacademy.groot.controllers;

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
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = GuardianController.class)
@WebAppConfiguration
@EnableWebMvc
public class GuardianControllerTest {
  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }


  @Test
  public void testIsOkWithParameter() throws Exception {
    this.mockMvc
            .perform(get("/groot")
                .contentType(MediaType.APPLICATION_JSON)
                .param("message", "kiscica"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.translated").value("I am Groot!"));
  }

  @Test
  public void testIsOkWithoutParameter() throws Exception {
    this.mockMvc
            .perform(get("/groot")
                    .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isBadRequest())
            .andExpect(jsonPath("$.error").value("I am Groot!"));
  }

  @Test
  public void arrowTest() throws Exception {
    this.mockMvc
            .perform(get("/yondu")
                    .contentType(MediaType.APPLICATION_JSON)
                    .param("distance", "100").param("time", "10"))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.speed").value(10));
  }

  @Test
  public void arrowTestWithoutParam() throws Exception {
    this.mockMvc
            .perform(get("/yondu")
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isBadRequest());
  }

}