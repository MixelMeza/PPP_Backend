package pe.edu.upeu.pracway.Pracway.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;
import pe.edu.upeu.pracway.Pracway.entity.Supervisor_Empresarial;
import pe.edu.upeu.pracway.Pracway.service.Supervisor_EmpresarialService;

@RestController
@RequestMapping("/api/supervisor_empresarial")
public class Supervisor_EmpresarialController {

	@Autowired
	private Supervisor_EmpresarialService supervisor_empresarialService;

	@GetMapping
	public ResponseEntity<List<Supervisor_Empresarial>> readAll() {
		try {
			List<Supervisor_Empresarial> Supervisor_Empresarial = supervisor_empresarialService.readAll();
			if (Supervisor_Empresarial.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(Supervisor_Empresarial, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@PostMapping
	public ResponseEntity<Supervisor_Empresarial> crear(@Valid @RequestBody Supervisor_Empresarial sup) {
		try {
			Supervisor_Empresarial s = supervisor_empresarialService.create(sup);
			return new ResponseEntity<>(s, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@GetMapping("/{id}")
	public ResponseEntity<Supervisor_Empresarial> getSupervisor_EmpresarialId(@PathVariable("id") Long id) {
		try {
			Supervisor_Empresarial s = supervisor_empresarialService.read(id).get();
			return new ResponseEntity<>(s, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Supervisor_Empresarial> delSupervisor_Empresarial(@PathVariable("id") Long id) {
		try {
			supervisor_empresarialService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@PutMapping("/{id}")
	public ResponseEntity<?> updateSupervisor_Empresarial(@PathVariable("id") Long id,
			@Valid @RequestBody Supervisor_Empresarial sup) {

		Optional<Supervisor_Empresarial> s = supervisor_empresarialService.read(id);
		if (s.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);

		} else {
			return new ResponseEntity<>(supervisor_empresarialService.update(sup), HttpStatus.OK);
		}

	}
}
