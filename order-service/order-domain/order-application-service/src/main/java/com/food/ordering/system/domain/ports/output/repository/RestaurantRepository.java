package com.food.ordering.system.domain.ports.output.repository;

import com.food.ordering.system.order.service.domain.entity.Restaurant;

public interface RestaurantRepository {

    Restaurant findRestaurantInformation(Restaurant restaurant);

}
