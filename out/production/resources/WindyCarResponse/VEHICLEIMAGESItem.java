package WindyCarResponse;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class VEHICLEIMAGESItem{

	@SerializedName("VEHICLEIMAGE")
	private String vEHICLEIMAGE;

	public void setVEHICLEIMAGE(String vEHICLEIMAGE){
		this.vEHICLEIMAGE = vEHICLEIMAGE;
	}

	public String getVEHICLEIMAGE(){
		return vEHICLEIMAGE;
	}

	@Override
 	public String toString(){
		return 
			"VEHICLEIMAGESItem{" + 
			"vEHICLEIMAGE = '" + vEHICLEIMAGE + '\'' + 
			"}";
		}
}