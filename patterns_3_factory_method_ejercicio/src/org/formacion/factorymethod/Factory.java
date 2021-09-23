package org.formacion.factorymethod;

public class Factory{
	public Lavadora CreacionDeLavadora(String LavCarga)
	{
		if (LavCarga == null )
			return null;
		if ("frontal".equals(LavCarga)) {
			return new LavadoraCargaFrontal();
		}
		else if ("superior".equals(LavCarga)) {
			return new LavadoraCargaSuperior();
		}
		
		return null;
	}
}