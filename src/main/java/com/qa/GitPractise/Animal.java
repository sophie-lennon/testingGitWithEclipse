package com.qa.GitPractise;

public abstract class Animal {

	public String genus;
	public String species;

	public Animal(String genus, String species) {
		super();
		this.genus = genus;
		this.species = species;
	}

	public String getGenus() {
		return genus;
	}

	public void setGenus(String genus) {
		this.genus = genus;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

}
