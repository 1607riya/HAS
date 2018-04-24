
public class AirConditionerData {
	public int OnOff;
	public int TempUpDown;
	public int defaulttemp;
	public int currenttemp;

	public AirConditionerData(int defaulttemp, int currenttemp) {
		this.defaulttemp = defaulttemp;
		this.currenttemp = currenttemp;
	}
}