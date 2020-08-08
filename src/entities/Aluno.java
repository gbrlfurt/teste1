package entities;

public class Aluno {
	public String name;
	public double score;
	
	
	public double addScore(double exam) {
		this.score = this.score + exam;
		return score;
	}
	
	public double recuperacao() {
		double recu = 60 - score;
		return recu;
	}
	
	public String toString() {
		if (recuperacao() > 0) {
			return "FINAL GRADE ="
					+ score
					+String.format("%nFAILED") 
					+ String.format("%nMISSING %.2f POINTS", recuperacao());
		}else {
			return "FINAL GRADE ="
					+ score
					+ String.format("%nPASS");
		}
	}
	
				
	}

