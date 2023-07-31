package day230731;

public class CD
{
	private String registerNo;
	private String CDTitle;
	
	public CD(String registerNo, String CDTitle)
	{
		this.registerNo = registerNo;
		this.CDTitle = CDTitle;
	}

	public String getRegisterNo()
	{
		return registerNo;
	}

	public void setRegisterNo(String registerNo)
	{
		this.registerNo = registerNo;
	}

	public String getCDTitle()
	{
		return CDTitle;
	}

	public void setCDTitle(String cDTitle)
	{
		CDTitle = cDTitle;
	}
	
	
}
