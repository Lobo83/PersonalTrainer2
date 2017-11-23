package persitence.db.repository;

import org.springframework.data.repository.CrudRepository;

import persitence.db.model.MuscleJPA;

public interface MuscleRepository extends CrudRepository<MuscleJPA, Integer> {

}
