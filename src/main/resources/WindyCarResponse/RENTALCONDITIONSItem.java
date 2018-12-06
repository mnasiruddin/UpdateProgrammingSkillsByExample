package WindyCarResponse;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class RENTALCONDITIONSItem{

	@SerializedName("RENTALCONDITIONNAME")
	private String rENTALCONDITIONNAME;

	public void setRENTALCONDITIONNAME(String rENTALCONDITIONNAME){
		this.rENTALCONDITIONNAME = rENTALCONDITIONNAME;
	}

	public String getRENTALCONDITIONNAME(){
		return rENTALCONDITIONNAME;
	}

	@Override
 	public String toString(){
		return 
			"RENTALCONDITIONSItem{" + 
			"rENTALCONDITIONNAME = '" + rENTALCONDITIONNAME + '\'' + 
			"}";
		}
}