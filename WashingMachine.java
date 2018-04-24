
public class WashingMachine {
	int OnOff;
	int DryRinse;
	public int getDryRinse() {
		return DryRinse;
	}



	public void setDryRinse(int dryRinse) {
		DryRinse = dryRinse;
	}

	int x;
		
		
		public int getOnOff() {
			return OnOff;
		}



		public void setOnOff(int onOff) {
			OnOff = onOff;
		}



		public WashingMachine(int OnOff,int DryRinse){
			this.OnOff=OnOff;
			this.DryRinse=DryRinse;
		}
		
		public void SetWM(WashingMachine WM)
		{
			if(this.OnOff==1)
			{
				System.out.println("-- Washing Machine : ON --");
			}
			else
			{
				System.out.println("-- Washing Machine : OFF --");
			}
		}
		
		public void Wash(WashingMachine WM)
		{
			if(this.OnOff==0)
			{
				System.out.println("-- Washing Machine : OFF --\n");
			}
			else
			{
				x=this.getDryRinse();
				if(x==1)
				{
					System.out.println("-- Washing Machine : washing the clothes --\n");
				}
				else
				{
					System.out.println("-- Washing Machine : drying the clothes --\n");
				}
			}

		}
	
}
