package com.example.demo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDao {

	public List<Order> getOrders() {

		return Stream.of(new Order(101, "javatechie", 1, 3000), new Order(102, "sairam", 2, 5000),
				new Order(103, "jaishriram", 6, 6546)).collect(Collectors.toList());

	}

}
