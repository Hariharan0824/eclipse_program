package com.xworkz.perfums.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.perfums.dto.PerfumesDTO;
import com.xworkz.perfums.repo.PerfumesRepo;
import com.xworkz.perfums.repo.PerfumesRepoimpl;

@Configuration
@ComponentScan("com.xworkz.perfums")
public class PerfumesConfig {

	public PerfumesRepo getPerfumesRepo() {
		return new PerfumesRepoimpl();
	}
}
