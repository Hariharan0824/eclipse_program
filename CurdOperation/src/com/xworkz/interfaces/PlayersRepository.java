package com.xworkz.interfaces;

import com.xworkz.dtos.PlayerDTO;
public interface PlayersRepository {

int PLAYERS=4;
	
	public boolean save(PlayerDTO playerdto);
}
