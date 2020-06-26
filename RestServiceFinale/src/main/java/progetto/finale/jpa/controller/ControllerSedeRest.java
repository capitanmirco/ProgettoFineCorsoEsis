package progetto.finale.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import progetto.finale.jpa.entity.Sede;
import progetto.finale.jpa.repository.SedeRepository;



@RestController
@RequestMapping("/sede")
public class ControllerSedeRest {

	@Autowired
	private SedeRepository repository;


	@GetMapping("/{idSede}")
	public @ResponseBody Sede getSedeById(@PathVariable Integer id) {
		Sede result = null;

		result = repository.findById(id).orElse(new Sede());

		return result;
	}

	@PostMapping("/")
	public @ResponseBody Sede insertSede(@RequestBody Sede sede) {
		repository.save(sede);

		return sede;
	}

	@PutMapping("/")
	public @ResponseBody Sede updateSede(@RequestBody Sede sede) {

		Sede s = new Sede();
		s = repository.findById(sede.getIdSede()).orElse(new Sede()); //id
        s.setCitta(sede.getCitta()); //citta
        s.setDescrizione(sede.getDescrizione()); //descriz
        s.setIndirizzo(sede.getIndirizzo());							//indirizzo
        s.setNome(sede.getNome());
		repository.save(s);
		return s;
	}

	@DeleteMapping("/{idSede}")
	public @ResponseBody boolean deleteSede(@PathVariable Integer id) {
		repository.deleteById(id);
		boolean result = true;
		return result;
	}
}
