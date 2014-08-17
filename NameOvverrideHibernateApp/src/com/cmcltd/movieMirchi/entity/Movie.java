package com.cmcltd.movieMirchi.entity;

import java.util.List;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionOfElements;

@Entity
// @Entity(name="Chalchitra")
//@Table(name = "Chalchitra")
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	long id;
	String title;
	//@Column(name="Investment")
	double budget;
	// @CollectionOfElements
	@ElementCollection(fetch = FetchType.EAGER)
	@JoinTable(name="Movtag")
	List<String> tag = new ArrayList<String>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public List<String> getTag() {
		return tag;
	}

	public void setTag(List<String> tag) {
		this.tag = tag;
	}

}
