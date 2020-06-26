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

import progetto.finale.jpa.entity.Azienda;
import progetto.finale.jpa.repository.AziendaRepository;

@RestController
@RequestMapping("/azienda")
public class ControllerAziendaRest {

	@Autowired
	private AziendaRepository repository;

	@GetMapping("/{id}")
	public @ResponseBody Azienda getAziendaById(@PathVariable int id) {
		Azienda result = repository.findById(id).orElse(new Azienda());
		return result;
	}

	@PostMapping("/")
	public @ResponseBody Azienda insertAzienda(@RequestBody Azienda azienda) {
		Azienda result = repository.save(azienda);
		return result;
	}

	@PutMapping("/")
	public @ResponseBody boolean updateAzienda(@RequestBody Azienda azienda) {
		Azienda azi = new Azienda();
		azi = repository.findById(azienda.getPartitaIva()).orElse(new Azienda());
		if (repository.existsById(azi.getPartitaIva())) {

			azi.setDescrizione(azienda.getDescrizione());
			azi.setNome(azienda.getNome());
			repository.save(azi);

			return true;
		} else {
			return false;
		}

	}

	@DeleteMapping("/{id}")
	public @ResponseBody boolean deleteAzienda(@RequestBody Integer id) {
		repository.deleteById(id);
		boolean result = true;
		return result;
	}

}
