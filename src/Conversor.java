
import javax.swing.*;

public class Conversor {
	//valor del peso chileno
	private static double pesoChileno=1;
	//valor de 1 peso chileno en dolar
	private static double Dolar=0.0012;
	//valor de 1 peso chileno en euro
	private static double Euro=0.0011;
	//valor de 1 peso chileno en libra
	private static double Libra=0.00094;
	//valor de 1 peso chileno en yen
	private static double Yen=0.17;
	//valor de 1 peso chileno en won
	private static double Won=1.54;
	//usando esta forma puedo acceder a la variable a travez de getters y setters lo que evita que se nulifiquen
	//string para el primer menu 
	private String seleccion;
	//String para el menu de divisas
	private String opcion;
	//string para el menu de temperaturas
	private String opcionT;
	//double que contendra el resultado de la conversion de divisas
	private double resultado;
	//double que contendra el resultado de la conversion de temperaturas
	private double resultadoT;
	//double que contiene la transformacion del string obtenido con Joptionpane en el caso de las divisas
	private double numeroparseado;
	//double que contiene la transformacion del string obtenido en el caso de la temperatura
	private double tempparseado;
	//menus
	
	public void menuPrincipal(String seleccion) {
	//primer menu
	//condicionantes para derivar al siguiente menu
		Object opciones = JOptionPane.showInputDialog(null,"Convertidor","Selecciones su convertidor", JOptionPane.INFORMATION_MESSAGE,null, new Object[] 
				{"Conversion de divisas", "Conversion de temperatura"}, "Conversion de divisas");
		if (opciones == "Conversion de divisas") {
			JOptionPane.showMessageDialog(null, "Se ha seleccionado Conversor de divisas");
			this.setSeleccion("Conversion-de-divisas");
			divisas(getOpcion());
		}else if (opciones == "Conversion de temperatura") {
			JOptionPane.showMessageDialog(null, "Se ha seleccionado Conversor de temperatura");
			this.setSeleccion("Conversion-de-temperatura");
			temps(getOpcionT());
		}else {
			System.exit(0);
		}
	}
	public void divisas(String opcion) {
		//menu de divisas
		Object tipoMoneda= JOptionPane.showInputDialog(null,"Divisas","Convertidor de divisas", JOptionPane.INFORMATION_MESSAGE,null, new Object[] 
				{"PesoChileno-DolarEstadoUnidense",
						"PesoChileno-Euro", 
						"PesoChileno-LibraEsterlina", 
						"PesoChileno-YenJapones", 
						"PesoChileno-WonSurCoreano", 
						"DolarEstadoUnidense-PesoChileno", 
						"Euro-PesoChileno", 
						"LibraEsterlina-PesoChileno", 
						"YenJapones-PesoChileno", 
						"WonSurCoreano-PesoChileno"}, 
						"PesoChileno-DolarEstadounidense");
		String cambio= tipoMoneda.toString();
		this.opcion=cambio;
		Conversion();
	}
	
	//menu de temperaturas
public void temps(String opcionT){
		Object tipoTemperatura = JOptionPane.showInputDialog(null,"Temperaturas","Convertidor de temperaturas", JOptionPane.INFORMATION_MESSAGE,null, new Object[] 
		{"Celsius-Fahrenheit", "Fahrenheit-Celsius"}, "Celsius-Fahrenheit");
		String valor= tipoTemperatura.toString();
		this.opcionT=valor;
		ConversionT();
	}

//ejecuciones
//conversion de divisa
public void Conversion() {
	String numero= JOptionPane.showInputDialog("ingrese cantidad");
	//condicionante de que el string numero ha de contener digitos
	if(numero.matches("\\d+")) {
		this.numeroparseado=Double.parseDouble(numero);
		System.out.println(numeroparseado);
	}else {
		JOptionPane.showMessageDialog(null, "Valor invalido");
		JOptionPane.showMessageDialog(null, "Por favor ingrese una cantidad valida");
		Conversion();
	}
	switch(opcion) {
	
	//clp-dolar
	case "PesoChileno-DolarEstadoUnidense":
		resultado=numeroparseado*Dolar;
		JOptionPane.showMessageDialog(null, "El resultado es: "+ resultado + " dolares");
		System.out.println(resultado + " dolares");
		break;
		
	//clp-eur	
	case "PesoChileno-Euro":
		resultado=numeroparseado*Euro;
		JOptionPane.showMessageDialog(null, "El resultado es: "+ resultado + " euros");
		System.out.println(resultado + " euros");
		break;
		
	//clp-gpb	
	case "PesoChileno-LibraEsterlina":
	resultado=numeroparseado*Libra;
	JOptionPane.showMessageDialog(null, "El resultado es: "+ resultado + " libras");
	System.out.println(resultado + " libras");
	break;
	
	//clp-jpy
	case "PesoChileno-YenJapones":
	resultado=numeroparseado*Yen;
	JOptionPane.showMessageDialog(null, "El resultado es: "+ resultado + " yenes");
	System.out.println(resultado + " yenes");
	break;

	//clp-krw
	case "PesoChileno-WonSurCoreano":
	resultado=numeroparseado*Won;
	JOptionPane.showMessageDialog(null, "El resultado es: "+ resultado + " wons");
	System.out.println(resultado + " wons");
	break;

	//dolar-clp
	case "DolarEstadoUnidense-PesoChileno":
	resultado=numeroparseado/Dolar;
	JOptionPane.showMessageDialog(null, "El resultado es: "+ resultado + " pesos");
	System.out.println(resultado + " pesos");
	break;
	
	//eur-clp
	case "Euro-PesoChileno":
		resultado=numeroparseado/Euro;
		JOptionPane.showMessageDialog(null, "El resultado es: "+ resultado + " pesos");
		System.out.println(resultado + " pesos");
		break;
	
	//gpb-clp
	case "LibraEsterlina-PesoChileno":
		resultado=numeroparseado/Libra;
		JOptionPane.showMessageDialog(null, "El resultado es: "+ resultado + " pesos");
		System.out.println(resultado + " pesos");
		break;
		
	//jpy-clp
	case "YenJapones-PesoChileno":
		resultado=numeroparseado/Yen;
		JOptionPane.showMessageDialog(null, "El resultado es: "+ resultado + " pesos");
		System.out.println(resultado + " pesos");
		break;
	
	//krw-clp
	case "WonSurCoreano-PesoChileno":
		resultado=numeroparseado/Won;
		JOptionPane.showMessageDialog(null, "El resultado es: "+ resultado + " pesos");
		System.out.println(resultado + " pesos");
		break;

		}
	otra();
	}

//conversion de temperatura
public void ConversionT() {
	String temp= JOptionPane.showInputDialog("ingrese temperatura");
	
	if(temp.matches("\\d+")) {
		this.tempparseado=Double.parseDouble(temp);
	}else {
		JOptionPane.showMessageDialog(null, "Valor invalido");
		JOptionPane.showMessageDialog(null, "Por favor ingrese una cantidad valida");
		ConversionT();
	}
	
	switch(opcionT) {
	
	//de °C a °F
	case "Celsius-Fahrenheit":
		resultadoT=(tempparseado*1.8+32);
		JOptionPane.showMessageDialog(null, "El resultado es: " + resultadoT + "°F");
		System.out.println(resultadoT + " grados fahrenheit");
		break;
		
	//de °F a °C	
	case "Fahrenheit-Celsius":
		resultadoT=((tempparseado-32)*0.55555556);
		JOptionPane.showMessageDialog(null, "El resultado es: " + resultadoT + "°C");
		System.out.println(resultadoT + " grados celcius");
		break;
	}
	
	otra();
}
//metodo para realizar otra conversion
public void otra() {
	int continuar = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "continuar", JOptionPane.YES_NO_CANCEL_OPTION);
	if(continuar== JOptionPane.YES_OPTION) {
		menuPrincipal(seleccion);
	}else if(continuar== JOptionPane.NO_OPTION){
		JOptionPane.showMessageDialog(null, "Fin del programa");
		System.exit(0);
	}else {
		JOptionPane.showMessageDialog(null, "Fin del programa");
		System.exit(0);
	}
	System.out.println(continuar);
}
//fin de metodos y codigo util
//get and set seleccion
public String getSeleccion() {
	return seleccion;
}

public void setSeleccion(String seleccion) {
	this.seleccion = seleccion;
}
//get and set opcion
public String getOpcion() {
	return opcion;
}

public void setOpcion(String opcion) {
	this.opcion = opcion;
}
//get and set opcionT
public String getOpcionT() {
	return opcionT;
}

public void setOpcionT(String opcionT) {
	this.opcionT = opcionT;
}
//get and set peso
public static double getPesoChileno() {
	return pesoChileno;
}

public static void setPesoChileno(double pesoChileno) {
	Conversor.pesoChileno = pesoChileno;
}

}
//fin de la clase