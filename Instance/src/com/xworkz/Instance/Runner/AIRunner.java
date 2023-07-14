package com.xworkz.Instance.Runner;

import com.xworkz.Instance.things.AI;
import com.xworkz.Instance.things.Patents;

public class AIRunner extends AI{
	public static void main(String[] args) {
		AI runner=new Patents("Hari",23,34,"abc");
		runner.display();
		AIRunner runner1=new AIRunner();
		runner1.aiName="Hari";
	}

}
