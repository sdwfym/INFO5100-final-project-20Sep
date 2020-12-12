package dao;

import java.util.List;

public class VehicleModel {

    private Vehicle vehicle;
    //Cheapest active special
    private Special special;

    // for case6 own attribute
    private String specialId;
    private float specialPrice;
    private String incentiveType;
    private boolean haveSpecial;

	//All active specials
    private List<Special> allSpecials;


	public VehicleModel(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
        
	public VehicleModel(Vehicle vehicle, Special special) {
        this.vehicle = vehicle;
        this.special = special;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Special getSpecial() {
        return special;
    }

    public float getSpecialPrice() {
        return specialPrice;
    }

    public String getSpecialId() {
		return specialId;
	}
    
    public String getIncentiveType() {
		return incentiveType;
	}
    
    public boolean isHaveSpecial() {
		return haveSpecial;
	}    
    
    public List<Special> getAllSpecials() {
 		return allSpecials;
 	}

	public void setSpecialId(String specialId) {
		this.specialId = specialId;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void setSpecial(Special special) {
		this.special = special;
	}

	public void setSpecialPrice(float specialPrice) {
        this.specialPrice = specialPrice;
    }
	
	public void setIncentiveType(String incentiveType) {
		this.incentiveType = incentiveType;
	}
	
	public void setHaveSpecial(boolean haveSpecial) {
		this.haveSpecial = haveSpecial;
	}
	
	public void setAllSpecials(List<Special> allSpecials) {
		this.allSpecials = allSpecials;
	}
	
	
	public void addToAllSpecials(Special special) {
		allSpecials.add(special);
	}
}