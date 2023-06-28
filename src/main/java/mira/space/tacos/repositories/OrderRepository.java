package mira.space.tacos.repositories;

import mira.space.tacos.models.TacoOrder;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
}
