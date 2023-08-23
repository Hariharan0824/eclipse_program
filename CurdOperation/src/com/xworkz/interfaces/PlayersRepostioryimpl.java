package com.xworkz.interfaces;

import com.xworkz.dtos.PlayerDTO;

public class PlayersRepostioryimpl implements PlayersRepository{

	private PlayerDTO[] player=new PlayerDTO[PLAYERS];
	private int index=0;
	

	@Override
	public boolean save(PlayerDTO playerdto) {
		if(this.index<PLAYERS) {
			this.player[index]= playerdto;
			System.out.println(playerdto+" is player's data");
			this.index++;
		}else {
			System.err.println(playerdto+" is player's data");
		}
		return true;
		
	}
}
