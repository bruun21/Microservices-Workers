package bruun1.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import bruun1.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
