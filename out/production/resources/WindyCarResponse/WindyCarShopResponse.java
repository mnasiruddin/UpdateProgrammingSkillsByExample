package WindyCarResponse;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class WindyCarShopResponse{

	@SerializedName("MESSAGE")
	private String mESSAGE;

	@SerializedName("VEHICLES")
	private List<VEHICLESItem> vEHICLES;

	@SerializedName("RETURNCODE")
	private String rETURNCODE;

	public void setMESSAGE(String mESSAGE){
		this.mESSAGE = mESSAGE;
	}

	public String getMESSAGE(){
		return mESSAGE;
	}

	public void setVEHICLES(List<VEHICLESItem> vEHICLES){
		this.vEHICLES = vEHICLES;
	}

	public List<VEHICLESItem> getVEHICLES(){
		return vEHICLES;
	}

	public void setRETURNCODE(String rETURNCODE){
		this.rETURNCODE = rETURNCODE;
	}

	public String getRETURNCODE(){
		return rETURNCODE;
	}

	@Override
 	public String toString(){
		return 
			"WindyCarShopResponse{" + 
			"mESSAGE = '" + mESSAGE + '\'' + 
			",vEHICLES = '" + vEHICLES + '\'' + 
			",rETURNCODE = '" + rETURNCODE + '\'' + 
			"}";
		}
}