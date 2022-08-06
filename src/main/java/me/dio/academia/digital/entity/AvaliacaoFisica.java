package me.dio.academia.digital.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
@Entity
@Table(name = "tb_avaliacoes")
public class AvaliacaoFisica {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "aluno_id")
  private Aluno aluno;

  private LocalDateTime dataDaAvaliacao = LocalDateTime.now();

  //@Column(name="peso_atual")
  private double peso;

  //@Column(name="altura_atual")
  private double altura;

  //@Column(name="quadril_atual")
  private double quadril;

  //@Column(name="cintura_atual")
  private double cintura;

  //@Column(name="ombros_atual")
  private double ombros;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Aluno getAluno() {
    return aluno;
  }

  public void setAluno(Aluno aluno) {
    this.aluno = aluno;
  }

  public LocalDateTime getDataDaAvaliacao() {
    return dataDaAvaliacao;
  }

  public void setDataDaAvaliacao(LocalDateTime dataDaAvaliacao) {
    this.dataDaAvaliacao = dataDaAvaliacao;
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public double getQuadril() {
    return quadril;
  }

  public void setQuadril(double quadril) {
    this.quadril = quadril;
  }

  public double getCintura() {
    return cintura;
  }

  public void setCintura(double cintura) {
    this.cintura = cintura;
  }

  public double getOmbros() {
    return ombros;
  }

  public void setOmbros(double ombros) {
    this.ombros = ombros;
  }
}
