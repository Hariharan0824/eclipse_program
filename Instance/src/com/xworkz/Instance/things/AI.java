package com.xworkz.Instance.things;

public class AI {
	protected String aiName;
	protected int noOfAi;
	protected int noOFFutures;
	protected String fatherName;
	protected int types;
	protected int noOfUsers;
	protected int modelNo;
	protected String modelName;
	protected int starts;
	protected int noOfCountryUsing;
	protected String SplFutures;
	protected double weights;
	protected String trainingDate;
	protected String lossFunction;
	protected int layerSizes;
	protected String learningAlgorithm;
	protected String currentIteration;
	protected String isTrainined;
	protected String trainModel;
	protected String biases;
	
	public AI() {
		super();
	System.out.println("This is AI constructor");
	}

	public AI(String aiName, int noOfAi, int noOFFutures, String fatherName, int types, int noOfUsers, int modelNo,
			String modelName, int starts, int noOfCountryUsing, String splFutures, double weights, String trainingDate,
			String lossFunction, int layerSizes, String learningAlgorithm, String currentIteration, String isTrainined,
			String trainModel, String biases) {
		
		this.aiName = aiName;
		this.noOfAi = noOfAi;
		this.noOFFutures = noOFFutures;
		this.fatherName = fatherName;
		this.types = types;
		this.noOfUsers = noOfUsers;
		this.modelNo = modelNo;
		this.modelName = modelName;
		this.starts = starts;
		this.noOfCountryUsing = noOfCountryUsing;
		this.SplFutures = splFutures;
		this.weights = weights;
		this.trainingDate = trainingDate;
		this.lossFunction = lossFunction;
		this.layerSizes = layerSizes;
		this.learningAlgorithm = learningAlgorithm;
		this.currentIteration = currentIteration;
		this.isTrainined = isTrainined;
		this.trainModel = trainModel;
		this.biases = biases;
		
		System.out.println("aiName:"+this.aiName);
		System.out.println("noOfAi:"+this.noOfAi);
		System.out.println("noOFFutures:"+this.noOFFutures);
		System.out.println("fatherName:"+this.fatherName);
		System.out.println("types:"+this.types);
		System.out.println("noOfUsers:"+this.noOfUsers);
		System.out.println("modelNo:"+this.modelNo);
		System.out.println("modelName:"+this.modelName);
		System.out.println("starts:"+this.starts);
		System.out.println("noOfCountryUsing:"+this.noOfCountryUsing);
		System.out.println("SplFutures:"+this.SplFutures);
		System.out.println("weights:"+this.weights);
		System.out.println("trainingDate:"+this.trainingDate);
		System.out.println("lossFunction:"+this.lossFunction);
		System.out.println("layerSizes:"+this.layerSizes);
		System.out.println("learningAlgorithm:"+this.learningAlgorithm);
		System.out.println("currentIteration:"+this.currentIteration);
		System.out.println("isTrainined:"+this.isTrainined);
		System.out.println("trainModel:"+this.trainModel);
		System.out.println("biases:"+this.biases);
	}
	public void display() {
		System.out.println("This is AI method");
	}
	
	
	
}
	
	
	
	