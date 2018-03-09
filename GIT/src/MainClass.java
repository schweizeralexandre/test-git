/*
 * MainClass.java
 * Auteur: Alexandre Schweizer
 * Date de cr�ation: 9 mars 2018
 */

public class MainClass {
	public static void main(String[] args) {
		TestGit myFirstTestGit = new TestGitUpdate("My Parameter") ;
		System.out.println(myFirstTestGit.returnTheString());
		System.out.println("Voici la modification");
		System.out.println();
	}
}
