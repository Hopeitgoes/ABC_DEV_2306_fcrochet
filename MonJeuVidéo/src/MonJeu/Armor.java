package MonJeu;

public class Armor {

	int armor;
	String type;
	String nom;
	
	public Armor(int _armor,String _nom,String _type)
	{
		this.armor = _armor;
		this.nom = _nom;
		this.type = _type;
	}
	public String toString()
	{
		return this.getClass().getSimpleName()+" Nom: "+this.nom+" Armure"+this.armor+" Type: "+this.type;
	}
	//Getter armure
	public int getArmor()
	{
		return this.armor;
	}
}
