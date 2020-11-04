package tn.esprit.spring.services;



import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Contrat;
import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Role;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeServiceImplTest {
	
	@Autowired
	IEmployeService emp;
	IContratService con;
	
	@Test
	public void testAddOrUpdateEmploye()throws ParseException {
		//Employe(int id, String prenom, String nom, String email, String password, boolean actif, Role role)
		
		Employe e = new Employe(2 ,"emma", "kam", "emmanuelkamandanzambisa@.tn","4455555", true, Role.ADMINISTRATEUR); 
		Employe empAdded = emp.addOrUpdateEmploye(e); 
		assertEquals(e.getPrenom(), empAdded.getPrenom());
	
	}
	
	@Test
	public void testAjouterContrat()throws ParseException {
				//public Contrat(Date dateDebut, String typeContrat, float salaire)
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date d = dateFormat.parse("2020-11-04");
		Contrat c = new Contrat(1,d ,"Contrat de travail",54270406,2500); 
		Contrat contratAdded = emp.ajouterContrat(c);
		assertEquals(c.getTypeContrat(),contratAdded.getTypeContrat());
	
	}
	@Test
	public void testUpdateEmploye()throws ParseException {
		
		Employe e = new Employe(1 ,"emmanuel", "kamanda", "emmanuelkamandanzambisa@esprit.tn","manu", true, Role.ADMINISTRATEUR); 
		Employe empAdded = emp.updateEmploye(e); 
		assertEquals(e.getPassword(), empAdded.getPassword());
	
	}
	
//	@Test
//	public void testGetAllEmployes() {
//		List<Employe> employes = emp.getAllEmployes();
//		// if there are 5 users in DB : 
//		assertEquals(1, employes.size());
//	}
	

}
