# Tax Payer System

Exercício de fundamentos de POO em Java, desenvolvido durante o curso
"Java COMPLETO Programação Orientada a Objetos + Projetos", do
Nélio Alves: cálculo de impostos para pessoa física e jurídica,
usando classe abstrata e polimorfismo.

## Conceitos aplicados
- Classe abstrata (`TaxPayer`) e método abstrato (`tax()`)
- Herança (`Individual`, `Company`)
- Polimorfismo (lista de `TaxPayer` processada de forma uniforme)
- Encapsulamento

## Regras de negócio
- Pessoa física: 15% se renda < 20.000, senão 25% — com dedução de
  50% dos gastos com saúde
- Pessoa jurídica: 14% se mais de 10 funcionários, senão 16%
