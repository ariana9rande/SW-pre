package day230724;

public class ECar
{
	private int distance;
	private int battery;
	
	public ECar()
	{
		this.distance = 0;
		this.battery = 100;
	}
	
	public int getDistance()
	{
		return distance;
	}
	public void setDistance(int distance)
	{
		this.distance = distance;
	}
	public int getBattery()
	{
		return battery;
	}
	public void setBattery(int battery)
	{
		this.battery = battery;
	}
	
	public void dispDistance()
	{
		System.out.println("총주행거리 : " + this.distance + "km");
	}
	
	public void dispBattery()
	{
		System.out.println("배터리 충전량 : " + this.battery + "%");
	}
	
	public void charge()
	{
		this.battery = 100;
		System.out.println("충전 완료");
	}
	
	public void drive()
	{
		if(battery != 0)
		{
			this.distance++;
			this.battery -= 10;
		}
		else
			System.out.println("배터리 empty");
	}
}
