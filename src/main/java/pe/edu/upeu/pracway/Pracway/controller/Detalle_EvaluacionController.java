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
import pe.edu.upeu.pracway.Pracway.entity.DetalleEvaluacion;
import pe.edu.upeu.pracway.Pracway.service.Detalle_EvaluacionService;

@RestController
@RequestMapping("/api/detalle_evaluacion")
public class Detalle_EvaluacionController {

	@Autowired
	private Detalle_EvaluacionService detalleEvaluacionService;

	@GetMapping
	public ResponseEntity<List<DetalleEvaluacion>> readAll() {
		try {
			List<DetalleEvaluacion> detalles = detalleEvaluacionService.readAll();
			if (detalles.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(detalles, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping
	public ResponseEntity<DetalleEvaluacion> crear(@Valid @RequestBody DetalleEvaluacion detalle) {
		try {
			DetalleEvaluacion d = detalleEvaluacionService.create(detalle);
			return new ResponseEntity<>(d, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/{id}")
	public ResponseEntity<DetalleEvaluacion> getDetalleEvaluacionById(@PathVariable("id") Long id) {
		try {
			Optional<DetalleEvaluacion> detalle = detalleEvaluacionService.read(id);
			if (detalle.isPresent()) {
				return new ResponseEntity<>(detalle.get(), HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteDetalleEvaluacion(@PathVariable("id") Long id) {
		try {
			detalleEvaluacionService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/{id}")
	public ResponseEntity<?> updateDetalleEvaluacion(@PathVariable("id") Long id,
			@Valid @RequestBody DetalleEvaluacion detalle) {
		Optional<DetalleEvaluacion> d = detalleEvaluacionService.read(id);
		if (d.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(detalleEvaluacionService.update(detalle), HttpStatus.OK);
		}
	}
}
