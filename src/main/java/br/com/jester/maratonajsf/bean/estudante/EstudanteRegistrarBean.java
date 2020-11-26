package br.com.jester.maratonajsf.bean.estudante;

import br.com.jester.maratonajsf.model.Estudante;

import javax.inject.Named;
import java.io.Serializable;
import java.util.*;

import static java.util.Arrays.asList;

@Named //isso é um manegedbean
public class EstudanteRegistrarBean implements Serializable {

    private Estudante estudante = new Estudante();
    private String[] nomesArray = {"João", "Wanderley"};
    private List<String> nomesLista = asList("Paulo", "da", "Silva");
    private Set<String> nomesSet = new HashSet<>(asList("David", "Santos", "Eduardo", "Clara"));
    private Map<String, String> nomesMap = new HashMap<>();

    {
        nomesMap.put("João", "de barro");
        nomesMap.put("Flor", "de lis");
        nomesMap.put("Silvano", "Sales");
    }

    public Map<String, String> getNomesMap() {
        return nomesMap;
    }

    public void setNomesMap(Map<String, String> nomesMap) {
        this.nomesMap = nomesMap;
    }

    public Set<String> getNomesSet() {
        return nomesSet;
    }

    public void setNomesSet(Set<String> nomesSet) {
        this.nomesSet = nomesSet;
    }

    public String[] getNomesArray() {
        return nomesArray;
    }

    public void setNomesArray(String[] nomesArray) {
        this.nomesArray = nomesArray;
    }

    public List<String> getNomesLista() {
        return nomesLista;
    }

    public void setNomesLista(List<String> nomesLista) {
        this.nomesLista = nomesLista;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }
}
