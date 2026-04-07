package Exercicio3;

public class MaquinaBanho {
    private boolean emUso;
    private int quantAgua;
    private int quantShampoo;
    private Pet pet;



    public String verificaNivel(){
        if(quantAgua < 10 && quantShampoo < 2){
            return "Quantidade água:" + quantAgua + "\n"+
                    "Quantidade Shampoo: " + quantShampoo + "\n" +
                    " Maquiná precisa ser ter pelo menos 10 litros de água\n" +
                    " e dois litro de Shampoo para iniciar o banho";
        } else if (quantAgua == 10 && quantShampoo == 2) {
                    return "Quantidade de água: "+ quantAgua +
                            "Quantidade Shampoo: " + quantShampoo;
        } return "Quantidade de água e shampoo em níveis adequados";

    }
    public String abastecerAgua(){

        while(quantAgua <= 30){
            quantAgua= quantAgua + 2;
        } return "Quantidade água: " + quantAgua;
    }

    public String abastecerShampoo (){
        while (quantShampoo <= 10){
            quantShampoo = quantShampoo + 2;
        }
        return "Quantidade shampoo:" + quantShampoo;
    }

    public String usarMaquina(Pet pet) {

        if (emUso) {
            String resultadoLimpeza = limparMaquina();

            if (resultadoLimpeza.contains("Não há insumos")) {
                return resultadoLimpeza;
            }
        }

        this.emUso = true;
        this.pet = pet;
        return "Estamos dando banho no " + pet.getNomePet();
    }

    public String retirarMaquina(Pet pet){
        this.pet = pet;
        return "Retirando" + pet + " da máquina";
    }



        public String limparMaquina () {


            if (quantAgua >= 3 && quantShampoo <= 1) {
                quantAgua = quantAgua -3;
                quantShampoo = quantShampoo - 1;
                return "Máquina em processo de limpeza...";
            }
            return "A máquina já está limpa.";


        }

    public boolean verificaQuantidadeDePetNoBanho(){
        return pet != null;
    }
     public int quantidadePet() {
         if (pet == null) {
             return 0;
         } else {
             return 1;

         }

     }

}
