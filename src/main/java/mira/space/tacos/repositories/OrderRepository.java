package mira.space.tacos.repositories;

import mira.space.tacos.models.TacoOrder;

public interface OrderRepository {
    TacoOrder save(TacoOrder order);
}
