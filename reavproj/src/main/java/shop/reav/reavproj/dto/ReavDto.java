package shop.reav.reavproj.dto;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ReavDto {
    private int itemID;
	private String user;
    private String email;
    private String review;
    private double rating;
}