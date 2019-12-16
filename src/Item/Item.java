package Item;
/**
 * 
 * @author pvonf
 * Item Klasse für Keys
 *
 */
public class Item
{
	private int value;
	private int rarity;
	private String name;

	public Item(int value, int rarity, String name)
	{
		super();
		this.value = value;
		this.rarity = rarity;
		this.name = name;
	}

	public int getValue()
	{
		return value;
	}

	public void setValue(int value)
	{
		this.value = value;
	}

	public int getRarity()
	{
		return rarity;
	}

	public void setRarity(int rarity)
	{
		this.rarity = rarity;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}

