package control;

import model.Estacionamento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppEstacionamento {
    /*Exercício 1*/
    /*a*/
    public static void main(String[] args){
        Estacionamento estacionamento = new Estacionamento();
        estacionamento.setId(1);
        estacionamento.setCidade("Pelotas");
        estacionamento.setEndereco("Andrade Neves");
        estacionamento.setNomeFantasia("AmPm");
        estacionamento.setRazaoSocial(102030);

        Estacionamento estacionamento2 = new Estacionamento();
        estacionamento2.setId(2);
        estacionamento2.setCidade("Pelotas");
        estacionamento2.setEndereco("Neto");
        estacionamento2.setNomeFantasia("Vieira");
        estacionamento2.setRazaoSocial(56321);


        Estacionamento estacionamento3 = new Estacionamento(3, 7854, "Paulo Moreira","Fernando Osório", "Rio Grande" );
        Estacionamento estacionamento4 = new Estacionamento(4, 456789, "Nicola's Park", "Dunas", "Bagé");
        Estacionamento estacionamento5 = new Estacionamento(5, "Estacionamento da sete", "15 de abril");
        Estacionamento estacionamento6 = new Estacionamento(6, "Estacionamento da quinze", "7 de abril");

        System.out.println("Impressão do exercício 1.a.");
        System.out.println(estacionamento3);
        System.out.println(estacionamento4);
        System.out.println(estacionamento5);
        System.out.println(estacionamento6);

        /*b*/
        System.out.println("\n\nImpressão do exercício 1.b.");
        System.out.println(estacionamento.getId());
        System.out.println(estacionamento.getRazaoSocial());
        System.out.println(estacionamento.getNomeFantasia());
        System.out.println(estacionamento.getEndereco());
        System.out.println(estacionamento.getCidade());
        System.out.println("\n");
        System.out.println(estacionamento2.getId());
        System.out.println(estacionamento2.getRazaoSocial());
        System.out.println(estacionamento2.getNomeFantasia());
        System.out.println(estacionamento2.getEndereco());
        System.out.println(estacionamento2.getCidade());


        /*2*/
        System.out.println("\n\nList");
        List<Estacionamento> estacionamentos = new ArrayList<>();
        estacionamentos.add(estacionamento);
        estacionamentos.add(estacionamento2);
        estacionamentos.add(estacionamento3);
        estacionamentos.add(estacionamento4);
        estacionamentos.add(estacionamento5);
        estacionamentos.add(estacionamento6);
        System.out.println("\n\nImpressão do exercício 2");
        System.out.println(estacionamentos);
        for (Estacionamento e : estacionamentos) {
            if (e.getId() == 4) {
                System.out.println(e);
            }
        }
        System.out.println("\nMap");
        Map<Integer, Estacionamento> estacionamentosMap = new HashMap<>();
        estacionamentosMap.put(estacionamento.hashCode(), estacionamento);
        estacionamentosMap.put(estacionamento2.hashCode(), estacionamento2);
        estacionamentosMap.put(estacionamento3.hashCode(), estacionamento3);
        estacionamentosMap.put(estacionamento4.hashCode(), estacionamento4);
        estacionamentosMap.put(estacionamento5.hashCode(), estacionamento5);
        estacionamentosMap.put(estacionamento6.hashCode(), estacionamento6);


        System.out.println(estacionamentosMap);
        System.out.println(estacionamentosMap.get(estacionamento4.hashCode()));

        System.out.println("\n\nReordenação");
        estacionamentos.sort((e1,e2)->{
            if(e1.getId()<e2.getId()){
                return 1;
            }if(e1.getId()>e2.getId()){
                return -1;
            }
            return 0;
        });
        System.out.println(estacionamentos);
    }
}
