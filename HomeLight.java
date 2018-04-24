
public class HomeLight {

int OnOff;
	
	
	
	public int getOnOff() {
		return OnOff;
	}



	public void setOnOff(int onOff) {
		OnOff = onOff;
	}



	public HomeLight(int OnOff){
		this.OnOff=OnOff;
	}
		
	
	
	public void setLight(HomeLight light)
	{
		if(this.OnOff==1)
		{
		
			System.out.println("\n--Home Light : ON--\n\n");
		}
		else
		{
			System.out.println("--Home Light : OFF--\n\n");
		}
	}
}
