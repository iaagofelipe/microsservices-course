package com.iaagofelipe.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iaagofelipe.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
