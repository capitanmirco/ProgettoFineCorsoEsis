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

import progetto.finale.jpa.entity.Appuntamenti;
import progetto.finale.jpa.repository.AppuntamentiRepository;


@RestController
@RequestMapping("/appuntamenti")
public class ControllerAppuntamentiRest {

	@Autowired
	private AppuntamentiRepository repository;
	
	@GetMapping("/{id}")
	public @ResponseBody Appuntamenti getAppuntamentiById(@PathVariable Integer id) {
		Appuntamenti result = repository.findById(id).orElse(new Appuntamenti());
		return result;
	}
	
	
	@PostMapping("/")
	public @ResponseBody Appuntamenti insertAppuntamenti(@RequestBody Appuntamenti appuntamenti) {
		Appuntamenti result = repository.save(appuntamenti);
		return result;
	}
	
	@PutMapping("/")
	public @ResponseBody boolean updateAppuntamenti(@RequestBody Appuntamenti appuntamenti) {
		Appuntamenti app = new Appuntamenti();
		app = repository.findById(appuntamenti.getIdAppuntamenti()).orElse(new Appuntamenti());
		if (repository.existsById(app.getIdAppuntamenti())) {

			app.setCostoVisita(appuntamenti.getCostoVisita());
			app.setDataInizio(appuntamenti.getDataInizio());
			app.setClienti(appuntamenti.getClienti());
			app.setDipendenti(appuntamenti.getDipendenti());
			repository.save(app);

			return true;
		} else {
			return false;
		}

	}
	
	@DeleteMapping("/{id}")
	public @ResponseBody boolean deleteAppuntamenti(@RequestBody Integer id) {
		repository.deleteById(id);
		boolean result = true;
		return result;
	}
}
