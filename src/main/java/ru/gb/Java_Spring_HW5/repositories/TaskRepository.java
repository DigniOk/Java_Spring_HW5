package ru.gb.Java_Spring_HW5.repositories;

import ru.gb.Java_Spring_HW5.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> getTasksByStatus(Task.Status status);
}