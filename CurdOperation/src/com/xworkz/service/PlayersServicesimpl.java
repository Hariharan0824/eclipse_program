package com.xworkz.service;

import com.xworkz.dtos.PlayerDTO;
import com.xworkz.interfaces.PlayersRepository;
import com.xworkz.interfaces.PlayersRepostioryimpl;
import com.xworkz.util.PlayersUtil;

public class PlayersServicesimpl implements PlayersServices {
	private PlayersRepository playerrepo;

	public PlayersServicesimpl(PlayersRepository playerrepo) {
		this.playerrepo=playerrepo;
	}

	@Override
	public boolean validateAndsave(PlayerDTO playerdto) {
		String name = playerdto.getName();
		String sport = playerdto.getSportName();

		if (PlayersUtil.validate(name)) {
			System.out.println("Player name is: " + name);
		} else {
			System.err.println(name);
		}

		if (PlayersUtil.validate(sport)) {
			System.out.println("Sport name is: " + sport);
		} else {
			System.err.println(sport);
		}

		PlayersRepository player1 = new PlayersRepostioryimpl();
		player1.save(playerdto);

		return true;
	}
}
