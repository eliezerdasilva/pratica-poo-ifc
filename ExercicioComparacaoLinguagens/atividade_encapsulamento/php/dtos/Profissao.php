<?php
class Profissao {
    protected $nome;
    protected $salario;
    protected $nCarteiraTrabalho;

    public function __construct($nome, $salario, $nCarteiraTrabalho) {
        $this->nome = $nome;
        $this->salario = $salario;
        $this->nCarteiraTrabalho = $nCarteiraTrabalho;
    }

    // Getters e Setters
    public function getNome() {
        return $this->nome;
    }

    public function setNome($nome) {
        $this->nome = $nome;
    }

    public function getSalario() {
        return $this->salario;
    }

    public function setSalario($salario) {
        $this->salario = $salario;
    }

    public function getnCarteiraTrabalho() {
        return $this->nCarteiraTrabalho;
    }

    public function setnCarteiraTrabalho($nCarteiraTrabalho) {
        $this->nCarteiraTrabalho = $nCarteiraTrabalho;
    }

    // Método __toString para exibir os detalhes da profissão
    public function __toString() {
        return "Profissao [nome=" . $this->nome . ", salario=" . $this->salario . ", nCarteiraTrabalho=" . $this->nCarteiraTrabalho . "]";
    }
}
?>
