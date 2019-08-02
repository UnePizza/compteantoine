class Compte {
	private int solde = 0;

	public Compte() {}
	public Compte(int solde) {
		this.solde = solde;
	}

	public int getSolde(){
		return this.solde;
	}

	public void depot (int montant){
		this.solde += montant;
	}
}
