package persitence.db.repository;

import org.springframework.data.repository.CrudRepository;

import persitence.db.model.MuscleJPA;

/**
 * The Interface MuscleRepository.
 */
public interface MuscleRepository extends CrudRepository<MuscleJPA, Integer> {

}
