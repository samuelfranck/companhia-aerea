package com.samuelfranck.companhiaaerea;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.samuelfranck.companhiaaerea.domain.Passageiro;
import com.samuelfranck.companhiaaerea.domain.Pessoa;
import com.samuelfranck.companhiaaerea.domain.enums.Sexo;
import com.samuelfranck.companhiaaerea.repositories.PassageiroRepository;
import com.samuelfranck.companhiaaerea.repositories.PessoaRepository;

@SpringBootApplication
public class CompanhiaAereaApplication implements CommandLineRunner {
	
	@Autowired
	private PassageiroRepository passageiroRepository;
	@Autowired
	private PessoaRepository pessoaRepository;

	public static void main(String[] args) {
		SpringApplication.run(CompanhiaAereaApplication.class, args);
		
		}

	@Override
	public void run(String... args) throws Exception {



		Pessoa p1 = new Pessoa(null,"331.453.981-23", "Júlio Carvalho", Sexo.MASCULINO);
		Pessoa p2 = new Pessoa(null,"239.444.761-45", "Camila Baroni", Sexo.FEMININO);
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Passageiro pass1 = new Passageiro(null, sdf.parse("16/07/1993"), p1);
		Passageiro pass2 = new Passageiro(null, sdf.parse("30/08/2000"), p2);
		
		p1.setPassageiro(pass1);
		p2.setPassageiro(pass2);
		
		pass1.getTelefones().addAll(Arrays.asList("15 3887-1523","15 8985-1237"));
		pass2.getTelefones().addAll(Arrays.asList("16 2974-1231", "16 9786-0013"));
		
		pass1.setPessoa(p1);
		pass2.setPessoa(p2);
		
		pessoaRepository.saveAll(Arrays.asList(p1,p2));
		passageiroRepository.saveAll(Arrays.asList(pass1,pass2));
		
		

		
	}

}
