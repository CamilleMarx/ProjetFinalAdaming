package com.adaming.test.DAO;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.adaming.DAO.IFicheAnimalDao;
import com.adaming.model.FicheAnimal;

@RunWith(SpringRunner.class)
@SpringBootTest
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public class FicheAnimalDaoImplTest {
	
	@Autowired
    private IFicheAnimalDao ficheAnimalDao;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(IFicheAnimalDao.class);
	
	@Test
	public void givenEntityRepository_whenSaving() {
		LOGGER.info("-------Testing givenEntityRepository_whenSaving Method------");
		FicheAnimal addedFiche = ficheAnimalDao.save(new FicheAnimal(1,"Pupuce", "Boxer", true, 4));
		LOGGER.info("-------Fiche saved------");
		LOGGER.info("-------Searching for Fiche------");
		FicheAnimal foundFiche = ficheAnimalDao.findById(addedFiche.getIdAnim()).orElse(null);
		LOGGER.info("-------Fiche found------");
		LOGGER.info("-------Verifyng Fiche------");
		assertNotNull(foundFiche);
		assertEquals(addedFiche.getNomAnim(), foundFiche.getNomAnim());
		LOGGER.info("-------Fiche Verified and Compared------");

	}
	
	@Test
	public void givenEntityRepository_whenUpdating() {
		// TODO Auto-generated method stub
		LOGGER.info("-------Testing givenEntityRepository_whenUpdating Method------");
		FicheAnimal addedFiche = ficheAnimalDao.save(new FicheAnimal(1,"Pupuce", "Boxer", true, 4));
		LOGGER.info("-------Fiche1 saved------");
		LOGGER.info("-------Searching for Fiche1------");
		FicheAnimal foundFiche = ficheAnimalDao.findById(addedFiche.getIdAnim()).orElse(null);
		LOGGER.info("-------Fiche1 found------");
		FicheAnimal addedFiche1 = ficheAnimalDao.save(new FicheAnimal(1,"Molosse", "Boxer", true, 4));
		LOGGER.info("-------Fiche2 saved------");
		LOGGER.info("-------Searching for Fiche2------");
		FicheAnimal foundFiche1 = ficheAnimalDao.findById(addedFiche1.getIdAnim()).orElse(null);
		LOGGER.info("-------Fiche2 found------");
		LOGGER.info("-------Verifyng Fiches------");
		assertNotNull(foundFiche);
		assertNotNull(foundFiche1);
		assertNotEquals(foundFiche.getNomAnim(), foundFiche1.getNomAnim());
		LOGGER.info("-------Fiches Verified and Compared------");
						
	}
	
	@Test
	public void givenEntityRepository_whenDeleting() {
		// TODO Auto-generated method stub
		LOGGER.info("-------Testing givenEntityRepository_whenDeleting Method------");
		FicheAnimal addedFiche = ficheAnimalDao.save(new FicheAnimal(1,"Pupuce", "Boxer", true, 4));
		LOGGER.info("-------Fiche1 saved------");
		LOGGER.info("-------Searching for Fiche1------");
		FicheAnimal foundFiche = ficheAnimalDao.findById(addedFiche.getIdAnim()).orElse(null);
		LOGGER.info("-------Fiche1 found------");
		ficheAnimalDao.delete(addedFiche);
		LOGGER.info("-------Fiche Deleted------");
		FicheAnimal foundFiche1 = ficheAnimalDao.findById(addedFiche.getIdAnim()).orElse(null);
		LOGGER.info("-------Fiche2 saved------");
		LOGGER.info("-------Verifyng Fiches------");
		assertNotNull(foundFiche);
		assertNull(foundFiche1);
		LOGGER.info("-------Fiches Verified and Compared------");
			
	}
	
	@Test
	public void givenEntityRepository_whenRetrievingOneById() {
		// TODO Auto-generated method stub
		LOGGER.info("-------Testing givenEntityRepository_whenRetrievingOneById Method------");
		FicheAnimal addedFiche = ficheAnimalDao.save(new FicheAnimal(1,"Pupuce", "Boxer", true, 4));
		FicheAnimal foundFiche = ficheAnimalDao.findById(addedFiche.getIdAnim()).orElse(null);
		FicheAnimal addedFiche1 = ficheAnimalDao.save(new FicheAnimal(2,"Gérard", "Caniche", false, 6));
		FicheAnimal foundFiche1 = ficheAnimalDao.findById(addedFiche1.getIdAnim()).orElse(null);
		FicheAnimal addedFiche2 = ficheAnimalDao.save(new FicheAnimal(3,"Rantanplan", "Cowboy", true, 3));
		FicheAnimal foundFiche2 = ficheAnimalDao.findById(addedFiche2.getIdAnim()).orElse(null);
		LOGGER.info("-------Fiches saved and found------");
		LOGGER.info("-------Verifyng Fiches------");
		assertNotNull(foundFiche);
		assertNotNull(foundFiche1);
		assertNotNull(foundFiche2);
		assertEquals(addedFiche.getNomAnim(), foundFiche.getNomAnim());
		assertEquals(addedFiche1.getNomAnim(), foundFiche1.getNomAnim());
		assertEquals(addedFiche2.getNomAnim(), foundFiche2.getNomAnim());
		LOGGER.info("-------Fiches Verified and Compared------");
				
	}
	
	@Test
	public void givenEntityRepository_whenRetrievingAll() {
		// TODO Auto-generated method stub
		LOGGER.info("-------Testing givenEntityRepository_whenRetrievingAll Method------");
		ficheAnimalDao.save(new FicheAnimal(1,"Pupuce", "Boxer", true, 4));
		ficheAnimalDao.save(new FicheAnimal(2,"Gérard", "Caniche", false, 6));
		ficheAnimalDao.save(new FicheAnimal(3,"Rantanplan", "Cowboy", true, 3));
		LOGGER.info("-------Fiches saved------");
		LOGGER.info("-------List Creation------");
		List <FicheAnimal> maList = ficheAnimalDao.findAll();
//		for (FicheAnimal ficheAnimal : maList) {
//			LOGGER.info(ficheAnimal.getNomAnim());
//		}
		assertEquals(maList.size(),3);
		LOGGER.info("-------List Compared------");
		
	}
	
}