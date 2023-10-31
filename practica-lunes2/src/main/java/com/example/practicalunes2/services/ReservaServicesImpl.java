package com.example.practicalunes2.services;

import java.util.ArrayList;

import com.example.practicalunes2.model.ReservaDTO;

public class ReservaServicesImpl implements ReservaServices {
	
	ArrayList<ReservaDTO> reserva=new ArrayList<ReservaDTO>();

	@Override
	public ReservaDTO reserveBook(Long bookId, Long userId) {
		
		
		return null;
	}

	@Override
	public void cancelReservation(Long bookId, Long userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<ReservaDTO> getAllReservations(Long userId) {
		
		return reserva;
	}

}
