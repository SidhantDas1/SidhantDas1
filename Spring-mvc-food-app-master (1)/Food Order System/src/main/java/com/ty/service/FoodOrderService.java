package com.ty.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ty.dao.FoodOrderDao;
import com.ty.dto.FoodOrder;

@Component
public class FoodOrderService {

	@Autowired
	FoodOrderDao dao ;
	public FoodOrder placeFoodOrder(FoodOrder foodOrder) {
		return dao.placeFoodOrder(foodOrder) ;
	}
	
	public List<FoodOrder> getAllFoodOrders(){
		return dao.getAllFoodOrders() ;
		
	}
	
	public FoodOrder viewFoodOrderById(int id) {
		return dao.viewFoodOrderById(id) ;
	}
}
