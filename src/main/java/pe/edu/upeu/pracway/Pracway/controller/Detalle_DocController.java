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
import pe.edu.upeu.pracway.Pracway.entity.Detalle_Doc;
import pe.edu.upeu.pracway.Pracway.service.Detalle_DocService;

@RestController
@RequestMapping("/api/detalle_doc")
public class Detalle_DocController {

	@Autowired
	private Detalle_DocService detalle_docService;

	@GetMapping
	public ResponseEntity<List<Detalle_Doc>> readAll() {
		try {
			List<Detalle_Doc> detalle_doc = detalle_docService.readAll();
			if (detalle_doc.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(detalle_doc, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@PostMapping
	public ResponseEntity<Detalle_Doc> crear(@Valid @RequestBody Detalle_Doc det) {
		try {
			Detalle_Doc d = detalle_docService.create(det);
			return new ResponseEntity<>(d, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@GetMapping("/{id}")
	public ResponseEntity<Detalle_Doc> getDetalle_DocId(@PathVariable("id") Long id) {
		try {
			Detalle_Doc d = detalle_docService.read(id).get();
			return new ResponseEntity<>(d, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Detalle_Doc> delDetalle_Doc(@PathVariable("id") Long id) {
		try {
			detalle_docService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@PutMapping("/{id}")
	public ResponseEntity<?> updateDetalle_Doc(@PathVariable("id") Long id, @Valid @RequestBody Detalle_Doc det) {

		Optional<Detalle_Doc> d = detalle_docService.read(id);
		if (d.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {

			return new ResponseEntity<>(detalle_docService.update(det), HttpStatus.OK);
		}

	}
}
