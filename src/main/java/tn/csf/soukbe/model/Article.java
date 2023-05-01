package tn.csf.soukbe.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;  

@Entity  // Création d'une nouvelle entité

@Table  // Création d'une table dans la bd

public class Article {
	@Id //Clé primaire
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Autoincrément
	@Column // simple colonne
	private int id;  //attribut
	@Column  
	private String name; 
	@Column
	private double price;
	@Column
	private int quantity;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Article [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
	

}
