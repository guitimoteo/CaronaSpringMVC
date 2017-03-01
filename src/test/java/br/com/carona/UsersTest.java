package br.com.carona;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import br.com.carona.controller.UsersController;
import br.com.carona.entity.User;
import br.com.carona.repository.*;

@WebAppConfiguration
public class UsersTest {
/**
 * Baseado em: http://memorynotfound.com/unit-test-spring-mvc-rest-service-junit-mockito/
 */
private MockMvc mockMvc;
@Mock
private User user;
@Mock
private UserRepository users;

@InjectMocks
private UsersController userController;
	@Before
	public void init(){
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders
                .standaloneSetup(userController)
                .build();
        assertNotNull(mockMvc);
        //Users users = new Users();
        
    }
	@Test
	public void test() throws Exception {
		user.setEmail("email");
		user.setName("nome");
		user.setPassword("password");
				
		when(users.save(user)).thenReturn(user);
		when(userController.login("name", "password")).thenReturn(user);
			mockMvc.perform(get("localhost:8080/carona/api/users/login?name={name}&password={password}", "nome","senha"))
			 				.andExpect(status().isOk())
			 				.andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
			 				.andExpect(jsonPath("$[0].name", is("nome")));

	}

}
