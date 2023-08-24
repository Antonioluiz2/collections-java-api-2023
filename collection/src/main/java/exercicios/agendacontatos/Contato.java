package exercicios.agendacontatos;

import java.util.Objects;

public class Contato {
   private String name;
   private int number;
   
public Contato(String name, int number) {
	this.name = name;
	this.number = number;
}

public String getName() {
	return name;
}

public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
   

@Override
public String toString() {
	return "\n Contato [name=" + name + ", number=" + number + "]";
}

@Override
public int hashCode() {
	return Objects.hash(name);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Contato other = (Contato) obj;
	return Objects.equals(name, other.name);
}


   
}
