package net.hemant.springboot.Dao;
import org.springframework.data.jpa.repository.JpaRepository;
import net.hemant.springboot.entities.Jobs;


public interface JobDao extends JpaRepository<Jobs,Long> {

}
