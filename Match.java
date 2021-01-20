//Abstract Class written by Dee
//Requires every match to have data about the following periods
package application;

abstract class Match {
	protected int rp1;//rp is red points
	protected int rp2;
	protected int rp3;
	protected int rp4;
	protected int rp5;
	protected int rp6;
	protected int rp7;
	protected int rp8;
	protected int rp9;
	
	protected int gp1;//gp is green points
	protected int gp2;
	protected int gp3;
	protected int gp4;
	protected int gp5;
	protected int gp6;
	protected int gp7;
	protected int gp8;
	protected int gp9;
	
	
	void setRedp1(int score)
	{
		rp1 += score;
	}
	
	void setRedp2(int score)
	{
		rp2 += score;
	}
	
	void setRedp3(int score)
	{
		rp3 += score;
	}
	
	void setRedp4(int score)
	{
		rp4 += score;
	}
	
	void setRedp5(int score)
	{
		rp5 += score;
	}
	
	void setRedp6(int score)
	{
		rp6 += score;
	}
	
	void setRedp7(int score)
	{
		rp7 += score;
	}
	
	void setRedp8(int score)
	{
		rp8 += score;
	}
	
	void setRedp9(int score)
	{
		rp9 += score;
	}
	
	void setGreenp1(int score)
	{
		gp1 += score;
	}
	
	void setGreenp2(int score)
	{
		gp2 += score;
	}
	
	void setGreenp3(int score)
	{
		gp3 += score;
	}
	
	void setGreenp4(int score)
	{
		gp4 += score;
	}
	
	void setGreenp5(int score)
	{
		gp5 += score;
	}
	
	void setGreenp6(int score)
	{
		gp6 += score;
	}
	
	void setGreenp7(int score)
	{
		gp7 += score;
	}
	
	void setGreenp8(int score)
	{
		gp8 += score;
	}
	
	void setGreenp9(int score)
	{
		gp9 += score;
	}
	
	abstract int redPeriod1();
	abstract int redPeriod2();
	abstract int redPeriod3();
	abstract int redPeriod4();
	abstract int redPeriod5();
	abstract int redPeriod6();
	abstract int redPeriod7();
	abstract int redPeriod8();
	abstract int redPeriod9();
	
	abstract int greenPeriod1();
	abstract int greenPeriod2();
	abstract int greenPeriod3();
	abstract int greenPeriod4();
	abstract int greenPeriod5();
	abstract int greenPeriod6();
	abstract int greenPeriod7();
	abstract int greenPeriod8();
	abstract int greenPeriod9();

	protected abstract void submitMatch();

	protected abstract void printMatch();
}
