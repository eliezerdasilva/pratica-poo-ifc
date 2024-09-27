<?php
class Pessoa {
    private $name;
    private $idade;
    private $cpf;
    private $profissao;

    public function __construct($name, $idade, $cpf) {
        $this->name = $name;
        $this->idade = $idade;
        $this->cpf = $cpf;
    }

    // Getters e Setters
    public function getName() {
        return $this->name;
    }

    public function setName($name) {
        $this->name = $name;
    }

    public function getIdade() {
        return $this->idade;
    }

    public function setIdade($idade) {
        $this->idade = $idade;
    }

    public function getCpf() {
        return $this->cpf;
    }

    public function setCpf($cpf) {
        $this->cpf = $cpf;
    }

    public function getProfissao() {
        return $this->profissao;
    }

    public function setProfissao($profissao) {
        $this->profissao = $profissao;
    }

    public function __toString() {
        return "Pessoa [name=" . $this->name . ", idade=" . $this->idade . ", cpf=" . $this->cpf . ", profissao=" . $this->profissao . "]";
    }
}
?>
