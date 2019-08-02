class TestCompte{
	public static void main(String[] args) {
		Compte nazihaCmp = new Compte(50);
		System.out.println("initialemet blabla" + nazihaCmp.getSolde());
		nazihaCmp.depot(1600);
		System.out.println("après blabla" + nazihaCmp.getSolde());
	}
}
