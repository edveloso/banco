package br.com.edveloso.banco;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="SELLERS")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("S")
public class Seller extends User {

	private Long minPrice;

	public Long getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(Long minPrice) {
		this.minPrice = minPrice;
	}
	
}
