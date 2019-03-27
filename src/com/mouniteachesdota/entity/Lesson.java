package com.mouniteachesdota.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="lesson")
public class Lesson {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="lesson_id")
	private int id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="info")
	private String description;
	
	@Column(name="video_url")
	private String videoUrl;
	
	@Column(name="price")
	private double price;
	
	public Lesson() {
		
	}
	
	public Lesson(String title, String description, String videoUrl, double price) {
		this.title = title;
		this.description = description;
		this.videoUrl = videoUrl;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Lesson [id=" + id + ", title=" + title + ", description=" + description + ", videoUrl=" + videoUrl + ", price="
				+ price + "]";
	}
	
}
