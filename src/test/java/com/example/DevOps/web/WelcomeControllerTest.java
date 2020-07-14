package com.example.DevOps.web;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.client.HttpClientErrorException.Conflict;
import org.springframework.web.context.WebApplicationContext;


@SuppressWarnings("unused")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@WebAppConfiguration
class WelcomeControllerTest {
  private MockMvc mockMvc;
  
  @Autowired
  private WebApplicationContext context;
  
  @Before
  public void setUp() throws Exception {
	  mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
  }
	@Test
	void testWelcome() throws Exception {
		fail("Not yet implemented");
	mockMvc.perform(get("/")).andExpect(status().isOk()).andExpect(model().attribute("course", containsString("DevOps")));
	
	}

}
