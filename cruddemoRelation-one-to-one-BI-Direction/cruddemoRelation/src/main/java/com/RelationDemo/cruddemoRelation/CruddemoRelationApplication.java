package com.RelationDemo.cruddemoRelation;

import com.RelationDemo.cruddemoRelation.dao.AppDAO;
import com.RelationDemo.cruddemoRelation.entity.Instructor;
import com.RelationDemo.cruddemoRelation.entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoRelationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoRelationApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(AppDAO theAppDAO){
		return runner ->{
			//createUser(theAppDAO);
			//findUserById(theAppDAO);
			//deletUser(theAppDAO);
			findUserByIduserDEtails(theAppDAO);

		};
	}

	private void findUserByIduserDEtails(AppDAO theAppDAO) {
		InstructorDetail instructorDetail=theAppDAO.findByInstructorDetailsId(3);
		System.out.println(instructorDetail);
		System.out.println(instructorDetail.getInstructor());

	}

	private void deletUser(AppDAO theAppDAO) {
         theAppDAO.deletbyid(2);
	}

	private void findUserById(AppDAO theAppDAO) {
		Instructor instructor=theAppDAO.findById(1);
		System.out.println(instructor.toString());
		System.out.println(instructor.getInstructorDetail().toString());
	}

	private void createUser(AppDAO theAppDAO) {

		 Instructor instructor=new Instructor("ahmed","nasr","ahmednasr@gmail");
		InstructorDetail instructorDetail=new InstructorDetail("www.ahmednasryoutube.com","bbbbb");
		instructor.setInstructorDetail(instructorDetail);
		theAppDAO.save(instructor);
	}


}
