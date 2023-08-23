package com.xworkz.runner;

import com.xworkz.dtos.PlayerDTO;
import com.xworkz.interfaces.PlayersRepository;
import com.xworkz.interfaces.PlayersRepostioryimpl;
import com.xworkz.service.PlayersServices;
import com.xworkz.service.PlayersServicesimpl;

public class PlayersRunner {
	public static void main(String[] args) {
		PlayerDTO playerdto = new PlayerDTO("Virat Kohli", "Cricket");
		PlayersRepository repository = new PlayersRepostioryimpl();
		
		
		PlayersServices player = new PlayersServicesimpl(repository);
		boolean result = player.validateAndsave(playerdto);
		
		if(result) {
			System.out.println("Saved result is: "+result);
		}else {
			System.err.println(result);
		}
		
	}

}
