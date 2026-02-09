/**
 * PROYECTO: Calculadora de ROI y Auditoria de Marketing (v1.2 - FINAL)
 * OBJETIVO: Automatizar KPIs de Marketing Digital y validacion de datos.
 * AUTOR: Mateo Cañibano Domínguez
 */

public class CalculadoraROI {
    public static void main(String[] args) {

        // --- 1. ENTRADA DE DATOS ---
        // Defino las variables principales de la campaña.
        String nombreCampania = "Campania Captacion Q1";
        double inversionBruta = 1250.74;
        int clics = 850;
        int leads = 42;
        double ingresosVentas = 3100.00;

        // --- 2. LOGICA DE COSTES ---
        // Calculo los costes operativos incluyendo mi comision de gestion.
        double tasaComision = 0.15; // 15% de fee
        double comisionAgencia = inversionBruta * tasaComision;
        double costeTotal = inversionBruta + comisionAgencia;

        // --- 3. LOGICA DE RENDIMIENTO ---
        // Calculo el CPC y la Tasa de Conversion. 
        // Uso (double) para asegurar que la division de decimales sea exacta.
        double cpc = inversionBruta / clics;
        double tasaConversion = ((double) leads / clics) * 100;

        // --- 4. LOGICA DE RENTABILIDAD ---
        // Determino el beneficio neto y el ROI real sobre el gasto total.
        double beneficioNeto = ingresosVentas - costeTotal;
        double roi = (beneficioNeto / costeTotal) * 100;

        // --- 5. VALIDACION ESTRATEGICA ---
        // Aplico los criterios del briefing: ROI > 50% y Conversion > 2%.
        boolean esAptaParaEscalar = (roi > 50.0) && (tasaConversion > 2.0);

        // --- 6. SALIDA DE DATOS ---
        // Genero el informe final con precision de 3 decimales.
        System.out.println("==========================================");
        System.out.println("INFORME OPERATIVO: " + nombreCampania);
        System.out.println("==========================================");

        System.out.printf("Inversion Bruta:    %.3f EUR%n", inversionBruta);
        System.out.printf("Comision Agencia:   %.3f EUR%n", comisionAgencia);
        System.out.printf("Coste Total Real:   %.3f EUR%n", costeTotal);
        
        System.out.println("------------------------------------------");
        
        System.out.printf("CPC (Coste x Clic): %.3f EUR%n", cpc);
        System.out.printf("Tasa Conversion:    %.3f por ciento%n", tasaConversion);
        System.out.printf("ROI Final:          %.3f por ciento%n", roi);
        
        System.out.println("------------------------------------------");
        
        String decision = esAptaParaEscalar ? "SI" : "NO";
        System.out.println("[RESULTADO] Apta para escalar: " + decision);
        System.out.println("==========================================");
    }
}