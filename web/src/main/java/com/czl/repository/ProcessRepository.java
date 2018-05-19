package com.czl.repository;

import com.czl.bean.Process;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProcessRepository extends JpaRepository<Process, String> {
}
