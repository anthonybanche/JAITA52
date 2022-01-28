package control;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import model.CalcolatriceException;
import model.OpFactory;
import model.Operazione;

public class OperationController {
	
	private static OperationController instance;
	public static OperationController getInstance() {
		if(instance == null)
			instance = new OperationController();
		return instance;
	}
	
	private List<String> operationLog, output;
	private Map<String,Operazione> availableOperations;
	private Operazione currentOperation;
	private Double inputA, inputB;
	
	private OperationController() {
		this.operationLog = new LinkedList<>();
		this.output = new LinkedList<>();
		this.availableOperations = new HashMap<>();
	}

	private void getOrCreateOperation(String operation) throws CalcolatriceException {
		this.currentOperation = null;
		if (this.availableOperations.containsKey(operation))
			this.currentOperation = this.availableOperations.get(operation);
		else {
			this.currentOperation = OpFactory.createOperation(operation);
			this.availableOperations.put(operation, this.currentOperation);
		}
		if (this.currentOperation == null)
			throw new CalcolatriceException("failed to fetch operation");
	}

	public void operationInterpreter(String operation) throws CalcolatriceException {
		switch (operation.trim().toLowerCase()) {
		case "somma":
		case "addizione":
		case "+":
			this.getOrCreateOperation("+");
			break;

		case "sottrazione":
		case "differenza":
		case "-":
			this.getOrCreateOperation("-");
			;
			break;

		case "moltiplicazione":
		case "prodotto":
		case "x":
		case "*":
			this.getOrCreateOperation("*");
			;
			break;

		case "divisione":
		case "/":
			this.getOrCreateOperation("/");
			;
			break;

		default:
			throw new CalcolatriceException("Unknown operation '" + operation + "'");
		}
	}

	public void numberInterpreter(String input, boolean first) throws CalcolatriceException {
		try {
			if (first)
				this.inputA = Double.parseDouble(input);
			else
				this.inputB = Double.parseDouble(input);
		} catch (NumberFormatException e) {
			throw new CalcolatriceException("Unable to parse to integer \"" + input + "\"");
		}
	}

	public void executeOperation() throws CalcolatriceException {
		if (this.currentOperation == null)
			throw new CalcolatriceException("operation is null");
		if (this.inputA == null)
			throw new CalcolatriceException("number#1 is not defined");
		if (this.inputB == null)
			throw new CalcolatriceException("number#2 is not defined");
		this.currentOperation.calcola(this.inputA, this.inputB);
		String result = this.currentOperation.toString();
		this.operationLog.add(result);
		this.output.add(result);
	}

	private List<String> getLog(List<String> log) {
		List<String> toReturn = new ArrayList<>(log);
		log.clear();
		return toReturn;
	}

	public List<String> getHistory() {
		return new ArrayList<String>(this.operationLog);
	}

	public List<String> getOutput() {
		return this.getLog(this.output);
	}
}
