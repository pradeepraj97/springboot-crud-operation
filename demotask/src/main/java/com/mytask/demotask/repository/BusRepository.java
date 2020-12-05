package com.mytask.demotask.repository;

        import com.mytask.demotask.model.Bus;
        import org.springframework.data.jpa.repository.JpaRepository;

public interface BusRepository  extends JpaRepository<Bus,Integer> {
}
