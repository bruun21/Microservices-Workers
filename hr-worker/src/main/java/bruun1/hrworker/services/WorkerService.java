package bruun1.hrworker.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import bruun1.hrworker.entities.Worker;
import bruun1.hrworker.repositories.WorkerRepository;

@Service
public class WorkerService {
	
	@Autowired
	private WorkerRepository repository;
	
	@GetMapping
	public List<Worker> findAll(){
		return repository.findAll();
	}
	
	
	public Worker findById(Long id){
		Optional<Worker> workerFound = repository.findById(id);
		return workerFound.get();
	}
	
	

}
