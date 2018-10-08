package com.camargo.dto;

import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String DTO;
	private Date date;
	private AuthorDTO author;
	
	
	public CommentDTO() {
		
	}


	public CommentDTO(String dTO, Date date, AuthorDTO author) {
		super();
		DTO = dTO;
		this.date = date;
		this.author = author;
	}


	public String getDTO() {
		return DTO;
	}


	public void setDTO(String dTO) {
		DTO = dTO;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public AuthorDTO getAuthor() {
		return author;
	}


	public void setAuthor(AuthorDTO author) {
		this.author = author;
	}
	
	

}
