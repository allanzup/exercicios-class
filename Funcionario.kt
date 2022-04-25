package AulaClass

class Funcionario (
    val nome: String,
    val SobreNome: String,
    var HoraTrabalhadas: Double,
    var ValorPorHora: Double,
)
{
    fun nomecompleto(){
        println("nome:$nome $SobreNome")
    }
    fun calcularsalario (){
        var Salario: Double= HoraTrabalhadas * ValorPorHora

        println("seu salario a receber é: $Salario")
    }
    fun IncrementarHora(valor:Double){
ValorPorHora+=valor
    }
}