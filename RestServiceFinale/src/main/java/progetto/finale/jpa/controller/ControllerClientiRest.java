package progetto.finale.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import progetto.finale.jpa.entity.Clienti;

import progetto.finale.jpa.repository.ClientiRepository;



@RestController
@RequestMapping("/clienti")
public class ControllerClientiRest {
	
@Autowired
private ClientiRepository repository;

@GetMapping("/{codiceFiscale}")
public @ResponseBody Clienti getClientiById(@PathVariable String codiceFiscale) {
	
	Clienti result = repository.findById(codiceFiscale).orElse(new Clienti());


	return result;
}

@PostMapping("/")
public @ResponseBody Clienti insertClienti(@RequestBody Clienti cliente) {
	Clienti result= repository.save(cliente);

	return result;
}

@PutMapping("/")
public @ResponseBody Clienti updateClienti(@RequestBody Clienti cliente) {

	Clienti c = new Clienti();
	c = repository.findById(cliente.getCodiceFiscale()).orElse(new Clienti()); //id
   
		
		c.setNome(cliente.getNome()); //nome
	    c.setCognome(cliente.getCognome()); //cognome
	    c.setEmail(cliente.getEmail()); //email							
	    c.setPassword(cliente.getPassword()); //password
	    c.setDataNascita(cliente.getDataNascita()); //data nascita
	    c.setValidato(cliente.getValidato()); //validato
	    c.setTelefono(cliente.getTelefono()); //telefono
		repository.save(c);
	
		return c;
}

@DeleteMapping("/{codiceFiscale}")
public @ResponseBody boolean deleteClienti(@PathVariable String codiceFiscale) {
	repository.deleteById(codiceFiscale);
	boolean result = true;
	return result;
}

}
