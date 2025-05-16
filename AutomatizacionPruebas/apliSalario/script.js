// script.js
document.getElementById("calcularBtn").addEventListener("click", calcularSalarioNeto);

function calcularSalarioNeto() {
  const salarioBruto = parseFloat(document.getElementById("salarioBruto").value);
  const numPagas = parseInt(document.getElementById("numPagas").value);
  const numHijos = parseInt(document.getElementById("numHijos").value);
  let retencionIRPF = parseFloat(document.getElementById("retencionIRPF").value);

  if (isNaN(salarioBruto) || isNaN(numPagas) || isNaN(numHijos) || isNaN(retencionIRPF)) {
    alert("Por favor, rellena todos los campos correctamente.");
    return;
  }

  // Reducir IRPF según número de hijos (ajuste estándar para España)
  if (numHijos > 0) {
    retencionIRPF -= numHijos * 2; // 2% menos por hijo como referencia
    if (retencionIRPF < 0) retencionIRPF = 0;
  }

  // Seguridad Social (aproximadamente 6.35% del salario bruto)
  const seguridadSocial = salarioBruto * 0.0635;

  // Calcular IRPF (en porcentaje del salario bruto)
  const retencionTotalIRPF = (salarioBruto * (retencionIRPF / 100));

  // Salario Neto Anual
  const salarioNetoAnual = salarioBruto - seguridadSocial - retencionTotalIRPF;

  // Salario Neto Mensual
  const salarioNetoMensual = salarioNetoAnual / numPagas;

  // Mostrar el resultado
  document.getElementById("salarioNeto").innerText = salarioNetoMensual.toFixed(2);
}
