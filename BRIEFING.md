📝 Briefing: Desarrollo de Herramienta de Auditoría de Rentabilidad (v1.0)
📋 Contexto del Cliente
Una agencia de marketing digital necesita automatizar el control de calidad de sus campañas de Meta Ads. Actualmente, los gestores de cuentas cometen errores manuales al calcular el beneficio neto y el ROI real, ya que olvidan incluir la comisión fija por gestión y los impuestos.

🎯 Objetivo del Proyecto
Crear un programa en Java (CalculadoraROI.java) que procese los datos de una campaña y genere un informe de métricas clave listo para ser revisado por el departamento financiero.
+2

🛠️ Requisitos Técnicos (Especificaciones)
Entrada de Datos (Variables):


Identificación: Nombre de la campaña y plataforma.
+1


Inversión Bruta: Cantidad invertida en publicidad (ej: 1250.75€).


Rendimiento: Número total de clics y número de leads conseguidos.
+1

Ingresos Totales: Dinero generado por las ventas de esos leads.

Costes Fijos: Una variable para la "Comisión de Agencia" (fíjala en el 15% de la inversión).



Lógica de Negocio (Operadores):

Calcular el CPC (Coste por Clic).

Calcular la Tasa de Conversión de leads (Leads / Clics * 100).

Calcular el Beneficio Neto: (Ingresos - Inversión - Comisión de Agencia).

Calcular el ROI Final basado en el beneficio neto.


Salida de Datos (Output):

El programa debe mostrar por consola un informe estructurado y limpio.
+1

Debe incluir una validación lógica (boolean) que indique si la campaña es "Apta para Escalar" (esto ocurre si el ROI es mayor al 50% y la tasa de conversión es superior al 2%).