
public abstract class Character {
	
	//variables for all characters
	public String name;
	public int maxHP, HP, Atk, Def;
	
	//constructors for characters
	public Character(String name, int maxHP, int Atk, int Def) {
		this.name = name;
		this.maxHP = maxHP;
		this.HP = maxHP;
		this.Atk = Atk;
		this.Def = Def;
		
	}
	
	//methods for every character
	public abstract int attack();
	public abstract int defense();

	public String getName() {
		return name;
	}

	public int getMaxHP() {
		return maxHP;
	}

	public int getHP() {
		return HP;
	}

	public int getAtk() {
		return Atk;
	}

	public int getDef() {
		return Def;
	}
	
	
	
}
