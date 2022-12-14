package ValidadorDeSenhas;

public class Portal {

    private String senha;

    public Portal(String senha){

        this.senha = senha;

    }

    public Portal(){

        this.senha = "";

    }

    public String getSenha(){

        return this.senha;

    }

    public void setSenha(String senha){

        this.senha = senha;

    }

    private boolean hasLowerCase(){

        String[] letras = this.senha.split("");

        for(int i = 0; i < letras.length; i++){

            if(Character.isLowerCase(letras[i].charAt(0))){

                return true;

            }

        }

        return false;

    }

    private boolean hasUpperCase(){

        String[] letras = this.senha.split("");

        for(int i = 0; i < letras.length; i++){

            if(Character.isUpperCase(letras[i].charAt(0))){

                return true;

            }

        }

        return false;

    }

    private boolean hasNumber(){

        String[] letras = this.senha.split("");

        for(int i = 0; i < letras.length; i++){

            if(Character.isDigit(letras[i].charAt(0))){

                return true;

            }

        }

        return false;

    }

    private boolean hasSpecialCharacter(){

        String[] letras = this.senha.split("");

        for(int i = 0; i < letras.length; i++){

            if(!Character.isLetterOrDigit(letras[i].charAt(0))){

                return true;

            }

        }

        return false;

    }

    private boolean isInRange(){

        int qtdCaracteres = 0;

        String[] letras = this.senha.split("");

        for(int j = 0; j < letras.length; j++){

            qtdCaracteres++;

        }

        if(qtdCaracteres >= 6 && qtdCaracteres <= 32){

            return true;

        }

        else {

            return false;

        }

    }


    public boolean isSenhaValida(){

        if(hasUpperCase() && hasLowerCase() && hasNumber() && isInRange() && !hasSpecialCharacter()){

            return true;

        }

        else{

            return false;

        }

    }

}