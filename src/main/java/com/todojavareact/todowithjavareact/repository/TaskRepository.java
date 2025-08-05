package com.todojavareact.todowithjavareact.repository;

import com.todojavareact.todowithjavareact.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
