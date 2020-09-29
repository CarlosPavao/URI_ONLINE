package ExtremamenteFacil;
/**
 *
 * @author Carlos Pavão <carlos.henrique93@msn.com>
 */
import java.util.Scanner;

public class Uri_1061 {
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        String palavra;
		int dia = 0, hora = 0, minuto = 0, segundo = 0;
		boolean horasBoolean = false, minutosBolean = false, segundosBoolean = false;

		//----------------------
		palavra = entrada.next();
		int diaInicio = entrada.nextInt();
        
        int horaInicio = entrada.nextInt();
		palavra = entrada.next();
		int minutoInicial = entrada.nextInt();
		palavra = entrada.next();
		int segundoInicio = entrada.nextInt();
		//----------------------
		palavra = entrada.next();
		int diaFinal = entrada.nextInt();
		
		int horaFinal = entrada.nextInt();
		palavra = entrada.next();
		int minutoFinal = entrada.nextInt();
		palavra = entrada.next();
        int segundoFinal = entrada.nextInt();
        
        if(horaInicio > horaFinal)
        horasBoolean = true;

		if(minutoInicial > minutoFinal)
            minutosBolean = true;

		if(segundoInicio > segundoFinal)
			segundosBoolean = true;

		while(diaInicio != diaFinal)
		{
			dia++;
			diaInicio++;
		}

		while(horaInicio != horaFinal)
		{
			hora++;
			horaInicio++;
			if(horaInicio == 25)
            horaInicio = 1;
		}

		while(minutoInicial != minutoFinal)
		{
			minuto++;
			minutoInicial++;
			if(minutoInicial == 61)
				minutoInicial = 1;
		}

		while(segundoInicio != segundoFinal)
		{
			segundo++;
			segundoInicio++;
			if(segundoInicio == 61)
				segundoInicio = 1;
		}

		if(horasBoolean == true)
			dia--;

		if(minutosBolean == true)
			hora--;


		if(segundosBoolean == true)
			minuto--;

		System.out.print(dia+" dia(s)\n");
		System.out.print(hora+" hora(s)\n");
		System.out.print(minuto+" minuto(s)\n");
		System.out.print(segundo+" segundo(s)\n");

        entrada.close();
	}

}