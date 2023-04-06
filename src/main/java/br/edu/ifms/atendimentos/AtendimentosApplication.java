package br.edu.ifms.atendimentos;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class AtendimentosApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtendimentosApplication.class, args);
	}
	
	@GetMapping("/atendimentos")
	public ResponseEntity<String> olamundo() {
		return ResponseEntity.ok("TESTANDO SOFTWARE");
	}

	@GetMapping("/datahora")
	public ResponseEntity<Date> datahora() {
		var datahora = new Date();
		return ResponseEntity.ok(datahora);

	}


}
