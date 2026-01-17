package compack1;

public class EncapsulationClassA 
{
	private String empName;
	private int empSal;
	private int empExp;
	public String getempName() {
		return empName;
	}
	public void setempName(String empName) {
		this.empName = empName;
	}
	public int getempSal() {
		if(empExp>=5)
		{
			int incre=(empSal*50)/100;
			return empSal+incre;
		}
		else
		{
			int incre=(empSal*30)/100;
			return empSal;
		}
		
	}
	public void setempSal(int empSal) {
		this.empSal = empSal;
	}
	public int getempExp() {
		return empExp;
	}
	public void setempExp(int empExp) {
		this.empExp = empExp;
	}

	
}
