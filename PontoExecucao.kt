package AulaClass

fun main(){
    val novoFuncionario=Funcionario("allan","alex",10.0,25.5)
    novoFuncionario.nomecompleto()
    novoFuncionario.calcularsalario()
    novoFuncionario.IncrementarHora(8.0)
    novoFuncionario.calcularsalario()
    var funcionarios=ArrayList<Funcionario>()
    funcionarios.add(novoFuncionario)
    funcionarios.add(Funcionario("joao","alex",10.0,25.5))
    funcionarios.add(Funcionario("carlos","alex",10.0,25.5))
    funcionarios.add(Funcionario("joao2","alex",10.0,25.5))
    funcionarios.add(Funcionario("carlos2","alex",10.0,25.5))
    funcionarios.add(Funcionario("carlos22","alex",10.0,25.5))
    funcionarios.add(Funcionario("joao222","alex",10.0,25.5))
    funcionarios.add(Funcionario("carlos22222","alex",10.0,25.5))
    funcionarios.add(Funcionario("carlos3333","alex",10.0,25.5))
    funcionarios.add(Funcionario("joao333333","alex",10.0,25.5))
funcionarios.forEach{
    funcionario ->
    println(funcionario.nome)
}


}