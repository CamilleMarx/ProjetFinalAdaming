package com.adaming.test.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.adaming.model.FicheAnimal;
import com.adaming.service.IFicheAnimalService;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;




@RunWith(SpringRunner.class)
@SpringBootTest
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public class FicheAnimalControllerTest {
	

	@Autowired
    private IFicheAnimalService ficheAnimalService;
	
    private static final Logger LOGGER = LoggerFactory.getLogger(FicheAnimalControllerTest.class);
    
    @Autowired
    WebApplicationContext webApplicationContext;
    
    protected MockMvc mvc;

    @Before
    public final void setUp() {
    	mvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    	MockitoAnnotations.initMocks(this);
    }
    
    protected String uri;
    
    public FicheAnimalControllerTest() {
		this.uri = "/ficheAnimal";
    }
    
    protected final String mapToJson(Object obj) throws JsonProcessingException {
    	ObjectMapper objectMapper = new ObjectMapper();
    	return objectMapper.writeValueAsString(obj);
    }
    
    protected final <T> T mapFromJson(String json, Class<T> clazz)
    throws JsonParseException, JsonMappingException, IOException {
    	ObjectMapper objectMapper = new ObjectMapper();
    	return objectMapper.readValue(json,  clazz);
    }
   @Test
    public void save() {
    	LOGGER.info("--------Testing save Method -------");
    	LOGGER.info("--------Constructing Utilisateur -------");
    	FicheAnimal maFicheAnimal = new FicheAnimal(1, "Baba", "boxer", true, 4);
    	MvcResult mvcResult;
    	try {
    		LOGGER.info("--------Serializing FicheAnimal Object -------");
    		String inputJson = this.mapToJson(maFicheAnimal);
    		LOGGER.info("-------- Mocking Context Webservice and invoking the webservice -------");
    		mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri + "/ajoutAnim").contentType(MediaType.APPLICATION_JSON_VALUE).content(inputJson)).andReturn();
    		LOGGER.info("--------Getting HTTP Status -------");
    		int status = mvcResult.getResponse().getStatus();
    		LOGGER.info("--------Verrifying HTTP Status -------");
    		assertEquals(200, status);
    		LOGGER.info("--------Searching for FicheAnimal -------");
    		FicheAnimal ficheAnimalFound = ficheAnimalService.findById(new Integer(1));
    		LOGGER.info("--------Verrifying FicheAnimal -------");
    		assertEquals(ficheAnimalFound.getRace(), maFicheAnimal.getRace());
    	}catch (Exception e) {
    		e.printStackTrace();
    	}
    }
    
    @Test
	public void update() {
    	try {
			LOGGER.info("--------Testing update Method -------");
			LOGGER.info("--------Constructing FicheAnimal -------");
			FicheAnimal oldFicheAnimal = new FicheAnimal(1, "Baba", "boxer", true, 4);
			LOGGER.info("--------Saving FicheAnimal -------");
			ficheAnimalService.save(oldFicheAnimal);
			LOGGER.info("--------Modifying FicheAnimal -------");
			FicheAnimal newFicheAnimal = new FicheAnimal(1, "Bobo", "boxer", true, 4);
			LOGGER.info("--------Serializing FicheAnimal Object-------");
			String inputJson = this.mapToJson(newFicheAnimal);
			LOGGER.info("--------Mocking Context Webservice and invoking the webservice -------");
			MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.put(uri + "/1").contentType(MediaType.APPLICATION_JSON_VALUE).content(inputJson)).andReturn();
			LOGGER.info("-------- Getting HTTP Status-------");
			int status = mvcResult.getResponse().getStatus();
			LOGGER.info("--------Verifyng HTTP Status -------");
			assertEquals(200, status);
			LOGGER.info("--------Searching for FicheAnimal -------");
    		FicheAnimal ficheAnimalFound = ficheAnimalService.findById(new Integer(1));
    		LOGGER.info("--------Verrifying FicheAnimal -------");
    		assertEquals(ficheAnimalFound.getNomAnim(), newFicheAnimal.getNomAnim());
    	}catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    @Test
    public void delete() {
        try {
        	LOGGER.info("----------Testing delete Method-----------");
        	LOGGER.info("--------Constructing FicheAnimal -------");
			FicheAnimal maFicheAnimal = new FicheAnimal(1, "Baba", "boxer", true, 4);
			LOGGER.info("--------Saving FicheAnimal -------");
			ficheAnimalService.save(maFicheAnimal);
			LOGGER.info("----------Mocking Context Webservice and invoking the webservice-----------");
            MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.delete(uri + "/1")).andReturn();
            LOGGER.info("----------Getting HTTP Status-----------");
            int status = mvcResult.getResponse().getStatus();
            LOGGER.info("----------Verrifying HTTP Status-----------");
            assertEquals(200, status);
            LOGGER.info("----------Searching for Utilisateur-----------");
            FicheAnimal ficheAnimalFound = ficheAnimalService.findById(new Integer(1));
            LOGGER.info("----------Verifying utilisateur-----------");
            assertEquals(ficheAnimalFound, null);
        }catch (Exception e) {
            e.printStackTrace();

        }
    }
    
   @Test
    public void findAll() {
    	MvcResult mvcResult;
    	try {
    		LOGGER.info("--------Testing findAll Method -------");
    		LOGGER.info("--------Constructing FicheAnimal -------");
			FicheAnimal maFicheAnimal = new FicheAnimal(1, "Baba", "boxer", true, 4);
			LOGGER.info("--------Saving FicheAnimal -------");
			ficheAnimalService.save(maFicheAnimal);
			LOGGER.info("--------Mocking Context Webservice -------");
    		mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri + "/all").accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
    		LOGGER.info("--------Getting HTTP Status -------");
    		int status = mvcResult.getResponse().getStatus();
    		LOGGER.info("--------Verifying HTTP Status -------");
    		assertEquals(200, status);
    		LOGGER.info("--------Getting HTTP Response -------");
    		String content = mvcResult.getResponse().getContentAsString();
    		LOGGER.info("--------Deserializing JSON Response -------");
    		FicheAnimal[] ficheAnimalList = this.mapFromJson(content, FicheAnimal[].class);
    		assertTrue(ficheAnimalList.length > 0);
    	}catch (Exception e) {
    		e.printStackTrace();
    	}
    }
    
    @Test
    public void findById() {
    	MvcResult mvcResult;
    	try {
    		LOGGER.info("--------Testing findAll Method -------");
    		LOGGER.info("--------Constructing FicheAnimal -------");
			FicheAnimal maFicheAnimal = new FicheAnimal(1, "Baba", "boxer", true, 4);
			LOGGER.info("--------Saving FicheAnimal -------");
			ficheAnimalService.save(maFicheAnimal);
			LOGGER.info("--------Mocking Context Webservice -------");
    		mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri + "/1").accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
    		LOGGER.info("--------Getting HTTP Status -------");
    		int status = mvcResult.getResponse().getStatus();
    		LOGGER.info("--------Verifying HTTP Status -------");
    		assertEquals(200, status);
    		LOGGER.info("--------Getting HTTP Response -------");
    		String content = mvcResult.getResponse().getContentAsString();
    		LOGGER.info("----------Searching for Utilisateur-----------");
            FicheAnimal ficheAnimalFound = ficheAnimalService.findById(maFicheAnimal.getIdAnim());
            LOGGER.info("----------Verifying utilisateur-----------");
            assertEquals(ficheAnimalFound.getNomAnim(), maFicheAnimal.getNomAnim()); 
    	}catch (Exception e) {
    		e.printStackTrace();
    	}
    }
    
}
