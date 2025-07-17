import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class sistema_credito {
    public static void main(String[] args) {
        Scanner lin = new Scanner(System.in);

        double prest = 0, mesp;
double interesAnual,interesMensual,cuota,seguroTotal,seguroMenal,saldoPendiente,amortizacion,interes,cuotaConSeguro,valorvivienda,totalSeguroDesgravamen=0;
DateTimeFormatter formatoFecha;
LocalDate fechaInicio;
        System.out.println("Ingrese el tipo de préstamo:");
        System.out.println("1 | PRECISO      ");   
        System.out.println("2 | LÍNEA ABIERTA ");
        System.out.println("3 |  HIPOTECARIO VIVIENDA  ");
        System.out.println("4 | VIVIENDA DE INTERÉS PÚBLICO");
        int proces = lin.nextInt();

        switch (proces) {
            case 1:
        

            System.out.println("======================================");
            System.out.println("               PRECISO                ");
            System.out.println("======================================");
            System.out.println("          INTERÉS: 15.6%              ");
            
            do {
                System.out.println("¿Cuánto dinero necesitas?");
                System.out.println("     Minimo 300$      ");
                prest = lin.nextInt();
            } while (prest <= 300);
            
            do {
                System.out.println("¿En cuántos meses desea pagarlo? ");
                System.out.println("           3 | 60 Meses        ");
                mesp = lin.nextInt();
            } while (mesp < 3 || mesp > 60);
            
            interesAnual = 15.6;
            interesMensual = interesAnual / 12 / 100;
            cuota = (prest * interesMensual) / (1 - Math.pow(1 + interesMensual, -mesp));
            
            saldoPendiente = prest;
            fechaInicio = LocalDate.now().plusMonths(1);
            formatoFecha = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            
            System.out.println("\n======================================");
            System.out.printf("Capital solicitado: $%.2f\n", prest);
            System.out.printf("Plazo: %.0f meses\n", mesp * 1.0); 
            System.out.println(cuota);
            System.out.println("======================================");
            
           
            System.out.println("Cuota | Fecha pago | Capital | Interés | Seguros desgrav. |  Valor cuota|  Saldo");
            
            for (int mes = 1; mes <= mesp; mes++) {
                seguroTotal = saldoPendiente * 0.0015;
                totalSeguroDesgravamen += seguroTotal;
                cuotaConSeguro = cuota + seguroTotal;
                interes = saldoPendiente * interesMensual;
                amortizacion = cuota - interes;
                saldoPendiente -= amortizacion;
                if (saldoPendiente < 0.01) saldoPendiente = 0;
            
                LocalDate fechaPago = fechaInicio.plusMonths(mes - 1);
            
                String interes2 = String.format("%.2f", interes);
                String cuota2 = String.format("%.2f", cuota);
                String amortizacion2 = String.format("%.2f", amortizacion);
                String segurototal2 = String.format("%.2f", seguroTotal);
                String saldoPendiente2 = String.format("%.2f", saldoPendiente);
            
                System.out.println(mes + "      " + fechaPago.format(formatoFecha) + "    " + amortizacion2 + "     " + interes2 + "      " + segurototal2 + "       " + cuota2 + "       " + saldoPendiente2);
            }
            System.out.printf("\nTotal seguro de desgravamen pagado: $%.2f\n", totalSeguroDesgravamen);
                
    break;
    case 2:
    System.out.println("======================================");
    System.out.println("               LINEA ABIERTA              ");
    System.out.println("======================================");
    System.out.println("          INTERÉS: 13%              ");

    
    do {
        System.out.println("¿Cuánto dinero necesitas?");
        System.out.println("     Minimo 3000$      ");
        prest = lin.nextInt();
    } while (prest < 3000);


    do {
        System.out.println("¿En cuántos meses desea pagarlo? ");
        System.out.println("           3 | 84 Meses        ");
        mesp = lin.nextInt();
    } while (mesp < 3 || mesp > 84);

    interesAnual = 13.0;
    interesMensual = interesAnual / 12 / 100;
    cuota = (prest * interesMensual) / (1 - Math.pow(1 + interesMensual, -mesp));
    System.out.println("\n======================================");
    System.out.printf("Capital solicitado: $%.2f\n", prest);
    System.out.printf("Plazo: %.0f meses\n", mesp * 1.0); 
    System.out.println("======================================");
    


       System.out.println("Cuota | Fecha pago | Capital | Interés | Seguros desgrav. |  Valor cuota|  Saldo");
    saldoPendiente = prest;
 fechaInicio = LocalDate.now().plusMonths(1);
    formatoFecha = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    for (int mes = 1; mes <= mesp; mes++) {
        seguroTotal = saldoPendiente * 0.000593;
        cuotaConSeguro = cuota + seguroTotal;
        totalSeguroDesgravamen += seguroTotal;
        interes = saldoPendiente * interesMensual;
        amortizacion = cuota - interes;
        saldoPendiente -= amortizacion;
        if (saldoPendiente < 0.01) saldoPendiente = 0;
    
        LocalDate fechaPago = fechaInicio.plusMonths(mes - 1);
     
        String interes2 = String.format("%.2f", interes);
        String cuota2=String.format("%.2f",cuota);
        String amortizacion2=String.format("%.2f",amortizacion);
        String segurototal2=String.format("%.2f", seguroTotal);
        String saldoPendiente2=String.format("%.2f", saldoPendiente);

        System.out.println(mes+"      "+fechaPago.format(formatoFecha)+"    "+ amortizacion2+"     "+interes2+"      "+segurototal2+"       "+cuota2+"       "+saldoPendiente2);
        
    }
    System.out.printf("\nTotal seguro de desgravamen pagado: $%.2f\n", totalSeguroDesgravamen);
break;
     case 3:
     System.out.println("======================================");
     System.out.println("            HIPOTECARIO VIVIENDA               ");
     System.out.println("======================================");
     System.out.println("          INTERÉS: 10.3%             ");
     do {
        System.out.println("¿Cuánto cuesta la vivienda ?");
        System.out.println("     Minimo 3000$           ");
        valorvivienda = lin.nextInt();
    } while (valorvivienda <= 3000);

     do {
         System.out.println("¿Cuánto dinero necesitas?");
         prest = lin.nextInt();
         if (valorvivienda<prest) {
            System.out.println("el valor debe ser menor o igual al de la vivienda ");
         }
     } while (prest<3000 || prest > valorvivienda);
     do {
         System.out.println("¿En cuántos meses desea pagarlo? ");
         System.out.println("           36 | 240 Meses        ");
         mesp = lin.nextInt();
     } while (mesp < 36 || mesp > 240);

     interesAnual = 10.3;
     interesMensual = interesAnual / 12 / 100;
     cuota = (prest * interesMensual) / (1 - Math.pow(1 + interesMensual, -mesp));

    
     System.out.println("\n======================================");
     System.out.printf("Capital solicitado: $%.2f\n", prest);
     System.out.printf("Plazo: %.0f meses\n", mesp * 1.0); 
     System.out.println("======================================");
     
  

        System.out.println("Cuota | Fecha pago | Capital | Interés | Seguros desgrav. |  Valor cuota|  Saldo");
     saldoPendiente = prest;
  fechaInicio = LocalDate.now().plusMonths(1);
     formatoFecha = DateTimeFormatter.ofPattern("yyyy-MM-dd");

     for (int mes = 1; mes <= mesp; mes++) {
         seguroTotal = saldoPendiente * 0.000575;
         cuotaConSeguro = cuota + seguroTotal;
         interes = saldoPendiente * interesMensual;
         amortizacion = cuota - interes;
         saldoPendiente -= amortizacion;
         if (saldoPendiente < 0.01) saldoPendiente = 0;
     
         LocalDate fechaPago = fechaInicio.plusMonths(mes - 1);
      
         String interes2 = String.format("%.2f", interes);
         String cuota2=String.format("%.2f",cuota);
         String amortizacion2=String.format("%.2f",amortizacion);
         String segurototal2=String.format("%.2f", seguroTotal);
         String saldoPendiente2=String.format("%.2f", saldoPendiente);

         System.out.println(mes+"      "+fechaPago.format(formatoFecha)+"    "+ amortizacion2+"     "+interes2+"      "+segurototal2+"       "+cuota2+"       "+saldoPendiente2);
         
     }   
     System.out.printf("\nTotal seguro de desgravamen pagado: $%.2f\n", totalSeguroDesgravamen);

break;
     case 4:
     System.out.println("======================================");
     System.out.println("           VIVIENDA DE INTERÉS PÚBLICO              ");
     System.out.println("======================================");
     System.out.println("         INTERÉS: 4.87%               ");
     do {
        System.out.println("¿Cuánto cuesta la vivienda ?");
        System.out.println("      83.000$ | 107.000$         ");
        valorvivienda = lin.nextInt();
        if (valorvivienda < 83000 || valorvivienda > 107000) {
            System.out.println("El valor debe estar entre 83.000 y 107.000 dólares.");
        }
    } while (valorvivienda < 83000 || valorvivienda > 107000);

     do {
         System.out.println("¿Cuánto dinero necesitas?");
         System.out.println(" Tu monto debe ser mayor a $83.664,70---Tu monto debe ser menor a $107.630,00");
         prest = lin.nextInt();
         if (prest <83000 || prest > 107000 ) {
            System.out.println("el valor debe ser menor o igual al de la vivienda ");
         }
     } while (prest <83000 || prest > 107000);
     do {
         System.out.println("¿En cuántos meses desea pagarlo? ");
         System.out.println("           240 | 300 Meses        ");
         mesp = lin.nextInt();
     } while (mesp < 240 || mesp > 300);
     interesAnual = 4.87;
     interesMensual = interesAnual / 12 / 100;
     cuota = (prest * interesMensual) / (1 - Math.pow(1 + interesMensual, -mesp));

     System.out.println("\n======================================");
     System.out.printf("Capital solicitado: $%.2f\n", prest);
     System.out.printf("Plazo: %.0f meses\n", mesp * 1.0); 
     System.out.println("======================================");
     

        System.out.println("Cuota | Fecha pago | Capital | Interés | Seguros desgrav. |  Valor cuota|  Saldo");
     saldoPendiente = prest;
  fechaInicio = LocalDate.now().plusMonths(1);
     formatoFecha = DateTimeFormatter.ofPattern("yyyy-MM-dd");

     for (int mes = 1; mes <= mesp; mes++) {
         seguroTotal = saldoPendiente * 0.000575;
         cuotaConSeguro = cuota + seguroTotal;
         interes = saldoPendiente * interesMensual;
         amortizacion = cuota - interes;
         saldoPendiente -= amortizacion;
         if (saldoPendiente < 0.01) saldoPendiente = 0;
     
         LocalDate fechaPago = fechaInicio.plusMonths(mes - 1);
      
         String interes2 = String.format("%.2f", interes);
         String cuota2=String.format("%.2f",cuota);
         String amortizacion2=String.format("%.2f",amortizacion);
         String segurototal2=String.format("%.2f", seguroTotal);
         String saldoPendiente2=String.format("%.2f", saldoPendiente);

         System.out.println(mes+"      "+fechaPago.format(formatoFecha)+"    "+ amortizacion2+"     "+interes2+"      "+segurototal2+"       "+cuota2+"       "+saldoPendiente2);
         
     }  
     System.out.printf("\nTotal seguro de desgravamen pagado: $%.2f\n", totalSeguroDesgravamen); 
break;
    default:
    System.out.println("No ingresado en el sistema");
        break;
}
    }

}

