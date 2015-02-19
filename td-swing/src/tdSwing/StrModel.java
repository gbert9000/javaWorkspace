package tdSwing;


/*le modele*/
public class StrModel {
	private StringBuffer sb;


	public StrModel() {
		sb = new StringBuffer();
	}
	public void appendA() {
		sb.append('a');
	}
	public void appendB() {
		sb.append('b');
	}
	public String getValue() {
		return sb.toString();
	}
	public void erase() {
		
		sb.deleteCharAt((sb.length()-1)); //on supprime le dernier caractère

	}
}