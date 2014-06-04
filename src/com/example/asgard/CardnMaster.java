package com.example.asgard;
public class CardnMaster implements java.io.Serializable
{
	private String master;
	private AllCard card;
	public CardnMaster()
	{
		master = new String();
		//card = new AllCard();
	}
	public CardnMaster(String m, AllCard c)
	{
		master = m;
		card = c;
	}
	public String getMaster()
	{
		return master;
	}
	public AllCard getCard()
	{
		return card;
	}
}