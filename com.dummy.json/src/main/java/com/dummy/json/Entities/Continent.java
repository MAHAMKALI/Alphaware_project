package com.dummy.json.Entities;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.List;

@Entity
public class Continent {
    @Id
    private String code;
    private String name;
    private Long areaSqKm;
    private Long population;
    private Integer countries;

    @ElementCollection
    private List<String> lines;

    @ElementCollection
    private List<String> oceans;

    @ElementCollection
    private List<String> developedCountries;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getAreaSqKm() {
		return areaSqKm;
	}

	public void setAreaSqKm(Long areaSqKm) {
		this.areaSqKm = areaSqKm;
	}

	public Long getPopulation() {
		return population;
	}

	public void setPopulation(Long population) {
		this.population = population;
	}

	public Integer getCountries() {
		return countries;
	}

	public void setCountries(Integer countries) {
		this.countries = countries;
	}

	public List<String> getLines() {
		return lines;
	}

	public void setLines(List<String> lines) {
		this.lines = lines;
	}

	public List<String> getOceans() {
		return oceans;
	}

	public void setOceans(List<String> oceans) {
		this.oceans = oceans;
	}

	public List<String> getDevelopedCountries() {
		return developedCountries;
	}

	public void setDevelopedCountries(List<String> developedCountries) {
		this.developedCountries = developedCountries;
	}

}

