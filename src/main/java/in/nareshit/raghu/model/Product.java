package in.nareshit.raghu.model;

import lombok.Data;

@Data
public class Product {

	private Integer prodId;
	private String prodCode;
	private Double prodCost;
	
	private Double prodGst;
	private Double prodDisc;
}
