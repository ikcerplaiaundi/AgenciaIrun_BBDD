package objetos;

public class Hotel {
	public int id;
	public String cif;
	public String nombre;
	public String gerente;
	public int estrellas;
	public String compania;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGerente() {
		return gerente;
	}

	public void setGerente(String gerente) {
		this.gerente = gerente;
	}

	public int getEstrellas() {
		return estrellas;
	}

	public void setEstrellas(int estrellas) {
		this.estrellas = estrellas;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	public String toString() {
		return "Hotel [id=" + id + ", cif=" + cif + ", nombre=" + nombre + ", gerente=" + gerente + ", estrellas="
				+ estrellas + ", compania=" + compania + "]";
	}

}
