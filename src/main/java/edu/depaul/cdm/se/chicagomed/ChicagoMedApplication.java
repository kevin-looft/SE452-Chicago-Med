package edu.depaul.cdm.se.chicagomed;


import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import edu.depaul.cdm.se.chicagomed.model.*;
import edu.depaul.cdm.se.chicagomed.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Optional;

@SpringBootApplication
public class ChicagoMedApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChicagoMedApplication.class, args);
	}
//
//	@Bean
//	public CommandLineRunner demo(PatientRepository repo, PatientContactRepository patientContactRepository) {
//		return (args) -> {
//			Patient patient = new Patient();
//			patient.setPatientFirstName("test");
//			patient.setPatientLastName("test");
//			patient = repo.save(patient);
//
//			PatientContact patientContact = new PatientContact();
//			patientContact.setPatient(patient);
//			patientContact.setPatientId(patient.getPatientId());
//			patientContactRepository.save(patientContact);
//
//			Optional<PatientContact> patientContact1 = patientContactRepository.findById(patient.getPatientId());
//			patientContact.getAddress();
//		};
//	}
//
//	@Bean
//	public CommandLineRunner Chicago(DoctorReviewRepository doctorReviewRepository) {
//		return (args) -> {
//			String doctorId;
//			DoctorReview doc = new DoctorReview(doctorId ="1023000","Dr. Johnson is a good doctor");
//			doctorReviewRepository.save(doc);
//		};
//	}
//
//	@Bean
//	public CommandLineRunner ApptNotesDemo(ApptNotesRepository apptNotesRepo) {
//		return (args) -> {
//			ApptNotes apptNote = new ApptNotes();
//			apptNote.setAppointmentId(1);
//			ObjectNode note = JsonNodeFactory.instance.objectNode();
//			note.put("Appointment1", "regular check.");
//			apptNote.setAppointmentNotes(note);
//			apptNotesRepo.save(apptNote);
//		};
//	}
//
//	@Bean
//	public CommandLineRunner DoctorScheduleDemo(DoctorScheduleRepository doctorScheduleRepo) {
//		return (args) -> {
//			DoctorSchedule schedule = new DoctorSchedule();
//			schedule.setDoctorID(1);
//			ObjectNode note = JsonNodeFactory.instance.objectNode();
//			note.put("Available Time", "Mon Tue Sat Sun");
//			schedule.setSchedule(note);
//			doctorScheduleRepo.save(schedule);
//		};
//	}

}
