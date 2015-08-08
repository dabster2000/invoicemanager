package dk.trustworks.invoicemanager.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Invoice {

	private Long id;
	
	@JsonProperty("invoicenumber")
	private long invoiceNumber;
	
	private int month;
	
	private int year;
	
	@JsonProperty("projectuuid")
	private String projectUUID;
	
	private Date created;

	public Invoice() {
	}

	public Invoice(long invoiceNumber, int month, int year, String projectUUID, Date created) {
		super();
		this.invoiceNumber = invoiceNumber;
		this.month = month;
		this.year = year;
		this.projectUUID = projectUUID;
		this.created = created;
	}
}
