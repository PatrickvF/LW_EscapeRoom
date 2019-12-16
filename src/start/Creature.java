package start;

/**
 * BAsisklasse von Player und Monster
 * @author patrick.von-fluee
 *
 */
public abstract class Creature
{
	private String name;
	private int hp;

	public Creature()
	{
		super();
	}

	public Creature(String name)
	{
		this.name = name;
	}

	public Creature(int hp)
	{
		this.hp = hp;
	}

	public Creature(String name, int hp)
	{
		this.name = name;
		this.hp = hp;
	}

	public int getHp()
	{
		return hp;
	}

	public void setHp(int hp)
	{
		this.hp = hp;
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
