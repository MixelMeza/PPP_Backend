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
import pe.edu.upeu.pracway.Pracway.entity.Detalle_PPP;
import pe.edu.upeu.pracway.Pracway.service.Detalle_PPPService;

@RestController
@RequestMapping("/api/detalle_ppp")
public class Detalle_PPPController {

	@Autowired
	private Detalle_PPPService detalle_PPPService;

	@GetMapping
	public ResponseEntity<List<Detalle_PPP>> readAll() {
		try {
			List<Detalle_PPP> detalle_PPP = detalle_PPPService.readAll();
			if (detalle_PPP.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(detalle_PPP, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@PostMapping
	public ResponseEntity<Detalle_PPP> crear(@Valid @RequestBody Detalle_PPP det) {
		try {
			Detalle_PPP d = detalle_PPPService.create(det);
			return new ResponseEntity<>(d, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@GetMapping("/{id}")
	public ResponseEntity<Detalle_PPP> getDetalle_PPPId(@PathVariable("id") Long id) {
		try {
			Detalle_PPP d = detalle_PPPService.read(id).get();
			return new ResponseEntity<>(d, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Detalle_PPP> delDetalle_PPP(@PathVariable("id") Long id) {
		try {
			detalle_PPPService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@PutMapping("/{id}")
	public ResponseEntity<?> updateDetalle_PPP(@PathVariable("id") Long id, @Valid @RequestBody Detalle_PPP det) {

		Optional<Detalle_PPP> d = detalle_PPPService.read(id);
		if (d.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {

			return new ResponseEntity<>(detalle_PPPService.update(det), HttpStatus.OK);
		}

	}
}
