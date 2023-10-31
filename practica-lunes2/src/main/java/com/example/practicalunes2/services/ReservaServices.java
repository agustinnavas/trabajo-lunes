package com.example.practicalunes2.services;

import java.util.ArrayList;

import com.example.practicalunes2.model.ReservaDTO;

public interface ReservaServices {
	
	ReservaDTO reserveBook(Long bookId, Long userId);
	
	void cancelReservation(Long bookId, Long userId);
	
	ArrayList<ReservaDTO>getAllReservations(Long userId);
	
}
