package com.cmcltd.movieMirchi.entity;

import java.util.List;
import java.util.ArrayList;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CollectionOfElements;

@Entity
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	long id;
	String title;
	double budget;
	// @CollectionOfElements
	@ElementCollection(fetch=FetchType.EAGER)
	List<String> tag = new ArrayList<String>();

	// @Embedded
	// MovieDetail movieDetail;
	//
	// public MovieDetail getMovieDetail() {
	// return movieDetail;
	// }
	//
	// public void setMovieDetail(MovieDetail movieDetail) {
	// this.movieDetail = movieDetail;
	// }

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
