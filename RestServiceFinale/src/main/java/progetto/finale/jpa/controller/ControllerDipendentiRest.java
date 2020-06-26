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

import progetto.finale.jpa.entity.Dipendenti;

import progetto.finale.jpa.repository.DipendentiRepository;


@RestController
@RequestMapping("/dipendenti")
public class ControllerDipendentiRest {

	@Autowired
	private DipendentiRepository repository;


	@GetMapping("/{id}")
	public @ResponseBody Dipendenti getDipendentiById(@PathVariable Integer id) {
		Dipendenti result = null;

		result = repository.findById(id).orElse(new Dipendenti());

		return result;
	}

	@PostMapping("/")
	public @ResponseBody Dipendenti insertDipendenti(@RequestBody Dipendenti dipendente) {
		repository.save(dipendente);

		return dipendente;
	}

	@PutMapping("/")
	public @ResponseBody Dipendenti updateDipendenti(@RequestBody Dipendenti dipendente) {

		Dipendenti d = new Dipendenti();
		d = repository.findById(dipendente.getMatricola()).orElse(new Dipendenti());
        d.setCognome(dipendente.getCognome()); 
        d.setEmail(dipendente.getEmail()); 
        d.setNome(dipendente.getNome());						
        d.setPassword(dipendente.getPassword());
        d.setRuolo(dipendente.getRuolo());
        d.setStipendio(dipendente.getStipendio());
        d.setValidato(dipendente.getValidato());
		repository.save(d);
		return d;
	}

	@DeleteMapping("/{id}")
	public @ResponseBody boolean deleteDipendenti(@PathVariable Integer id) {
		repository.deleteById(id);
		boolean result = true;
		return result;
	}
}
