package com.adaming.test.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.adaming.DAO.IFicheAnimalDao;
import com.adaming.model.FicheAnimal;
import com.adaming.serviceimpl.FicheAnimalServiceImpl;



@RunWith(SpringRunner.class)
@SpringBootTest
public class FicheAnimalServiceImplTest {

	private FicheAnimalServiceImpl ficheAnimalImpl;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(FicheAnimalServiceImplTest.class);
	
	@Mock
	private IFicheAnimalDao ficheAnimalDao;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		ficheAnimalImpl = new FicheAnimalServiceImpl(ficheAnimalDao);
	}
	@Test
	public void should_add_when_save_is_called() {
		 LOGGER.info("--------------- Executing should_add_when_save_is_called test Of FicheAnimalServiceImplTest ---------------");
	        FicheAnimal maFicheAnimal = new FicheAnimal();
	        ficheAnimalImpl.save(maFicheAnimal);
	        Mockito.verify(ficheAnimalDao).save(maFicheAnimal);
	    }
	 @Test
	    public void should_update_when_update_is_called() {
	        LOGGER.info("--------------- Executing should_update_when_update_is_called test Of FicheAnimalServiceImplTest ---------------");
	        FicheAnimal maFicheAnimal = new FicheAnimal();
	        ficheAnimalImpl.update(maFicheAnimal);
	        Mockito.verify(ficheAnimalDao).save(maFicheAnimal);
	    }
	 
	 @Test
	    public void should_delete_when_delete_is_called() {
	        LOGGER.info("--------------- Executing should_delete_when_delete_is_called test Of FicheAnimalServiceImplTest ---------------");
	        FicheAnimal maFicheAnimal = new FicheAnimal();
	        ficheAnimalImpl.delete(maFicheAnimal);
	        Mockito.verify(ficheAnimalDao).delete(maFicheAnimal);
	    }
	    
	}
	
	
	

